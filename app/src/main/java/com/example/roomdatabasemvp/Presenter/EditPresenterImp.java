package com.example.roomdatabasemvp.Presenter;

import com.example.roomdatabasemvp.Dao.PersonDao;
import com.example.roomdatabasemvp.Entity.Person;
import com.example.roomdatabasemvp.utils.Constants;
import com.example.roomdatabasemvp.utils.Util;

public class EditPresenterImp implements EditPresenter {

    private final EditView view;
    private final PersonDao personDao;

    public EditPresenterImp(EditView view, PersonDao personDao) {
        this.view = view;
        this.personDao = personDao;
    }

    @Override
    public void save(Person person) {
        this.personDao.insertPerson(person);


    }

    @Override
    public boolean validate(Person person) {
        if (person.getName().isEmpty()|| !Util.isValideEmail(person.getName())){
            view.showErrorMessage(Constants.ID_NAME);
            return false;
        }
        if (person.getAddress().isEmpty()){
            view.showErrorMessage(Constants.ID_ADRESS);
            return false;
        }
        if (person.getEmail().isEmpty()|| !Util.isValideEmail(person.getEmail())){
            view.showErrorMessage(Constants.ID_EMAIL);
            return false;
        }
        if (person.getPhone().isEmpty()|| !Util.isValidPhone(person.getPhone())){
            view.showErrorMessage(Constants.ID_PHONE);
        }
        return true;
    }

    @Override
    public void getperson(long id) {

    }

    @Override
    public void Update(Person person) {

    }
}
