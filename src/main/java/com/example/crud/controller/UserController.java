package com.example.crud.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.crud.domain.User;
import com.example.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class Controller {
    @Autowired
    UserService userService;





    @PostMapping("")
    public User Insert(@RequestBody  User user){
        return userService.Inert(user);
    }

    @GetMapping("")
    public ArrayList<User> getAllId(){
        return userService.getAllId();
    }


    @GetMapping("/{Id}")
    public User getId(@PathVariable String Id){
        return userService.getById(Id);
    }

    @PostMapping("/{Id}")

    public void UpDate(@PathVariable String Id,@RequestBody User user){
        userService.UpData(Id,user);
    }

    @GetMapping("/{Id}")
    public void Delete(@PathVariable String Id){
        userService.Delete(Id);
    }
}
