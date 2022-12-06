package com.example.crud.user.service;


import com.example.crud.user.domain.User;
import com.example.crud.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User insert(User user){
        return repository.insert(user);
    }

    public List<User> getAllId(){
        return repository.getAllUsers();
    }
    public User getById(String ID){
        return repository.getUser(ID);
    }

    public void upData(String ID, User user){
        repository.update(ID,user);
    }

    public void delete(String ID){
        repository.delete(ID);
    }
}
