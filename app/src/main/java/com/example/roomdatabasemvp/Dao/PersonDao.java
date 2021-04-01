package com.example.roomdatabasemvp.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdatabasemvp.Entity.Person;

import java.util.List;
@Dao
public interface PersonDao {

        @Insert
        void insertPerson (Person person);

        @Update
        void  Update (Person person);

        @Delete
        void Delete(Person person);

        @Query("SELECT * FROM person")
        List<Person> getAll();

        @Query("SELECT * FROM person WHERE id")
        Person findperson(long id);

    }


