package com.example.roomdatabasemvp.Presenter;

import com.example.roomdatabasemvp.Entity.Person;

public interface EditPresenter {

    void save (Person person);

    boolean validate(Person person);

    void getperson(long id);

    void Update(Person person);

}
