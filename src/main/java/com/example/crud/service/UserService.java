package com.example.crud.service;


import com.example.crud.domain.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;


public class UserService {

    @Autowired
    UserRepository repository;





    public User Inert(User user){
        return repository.Insert(user);
    }

    public ArrayList<User> getAllId(){
        return repository.getAllUsers();
    }
    public User getById(String Id){
        return repository.getUser(Id);
    }

    public void UpData(String Id,User user){
        repository.Update(Id,user);
    }

    public void Delete(String Id){
        repository.Delete(Id);
    }
}
