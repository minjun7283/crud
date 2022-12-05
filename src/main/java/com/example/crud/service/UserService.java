package com.example.crud.service;


import com.example.crud.domain.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


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
    public List<String> show(){
        return repository.show();
    }

    public void read(String right){
        repository.read(right);
    }
}
