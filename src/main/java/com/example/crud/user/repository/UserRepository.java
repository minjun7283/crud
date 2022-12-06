package com.example.crud.user.repository;


import com.example.crud.user.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public static ArrayList<User> users;


    static{
        users = new ArrayList<>();
        users.add(new User("kim ","k","123"));
        users.add(new User("min ","m","456"));
        users.add(new User("jun","j","789"));
    }

    public User insert(User user){
        users.add(user);
        return user;
    }


    public List<User> getAllUsers() {
        return users;
    }
    public User getUser(String Id){
        return users.stream()
                .filter(user -> user.getID().equals(Id))
                .findAny()
                .orElse(new User("", "",""));
    }

    public void update(String ID,  User user){
        users.stream()
                .filter(user1 -> user1.getID().equals(ID))
                .findAny()
                .orElse(new User("","",""))
                .setUserPw(user.getUserPw());
    }
    public void delete(String ID){
        users.removeIf(users -> users.getID().equals(ID));
    }

}
