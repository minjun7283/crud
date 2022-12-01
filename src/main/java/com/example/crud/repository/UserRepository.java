package com.example.crud.repository;


import com.example.crud.domain.User;

import java.util.ArrayList;

@org.springframework.stereotype.Repository
public class Repository {

    public static ArrayList<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("kim","min","jun"));
        users.add(new User("kin","mgn","juj"));
        users.add(new User("kif","men","juh"));
    }


    public User Insert(User user){
        users.add(user);
        return user;
    }
    public ArrayList<User> getAllUsers() {
        return users;
    }
    public User getUser(String Id){
        return users.stream()
                .filter(User -> User.getId().equals(Id))
                .findAny()
                .orElse(new User(" ", " "," "));
    }

    public void Update(String Id, User user){
        users.stream()
                .filter(User -> User.getId().equals(Id))
                .findAny()
                .orElse(new User(" "," "," "))
                .setUserPw(user.getUserPw());

    }
    public void Delete(String Id){
        users.removeIf(User -> User.getId().equals(Id));
    }
}
