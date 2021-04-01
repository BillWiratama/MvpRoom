package com.example.roomdatabasemvp.Presenter;

import com.example.roomdatabasemvp.Entity.Person;

public interface EditView {

    void showErrorMessage(int id);
    void clearPreError();
    void populate(Person person);

}
