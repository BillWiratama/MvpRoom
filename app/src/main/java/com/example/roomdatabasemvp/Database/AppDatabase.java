package com.example.roomdatabasemvp.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.roomdatabasemvp.Entity.Person;

@Database(entities = {Person.class}, version = 1, exportSchema = false)
public abstract class   AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "Database")
                    .allowMainThreadQueries()
                    .build();


    }
        return INSTANCE;

    }

    public abstract Person.PersonDAO personDAO();

}
