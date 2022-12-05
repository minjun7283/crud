package com.example.crud.controller;

import com.example.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.crud.domain.User;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("")
    public User insert(@RequestBody  User user){
        return userService.insert(user);
    }

    @GetMapping("")
    public List<User> getAllId(){
        return userService.getAllId();
    }

    @GetMapping("/{ID}")
    public User getId(@PathVariable String ID){
        return userService.getById(ID);
    }

    @PutMapping("/{ID}")
    public void upDate(@PathVariable String ID, @RequestBody User user){
        userService.upData(ID,user);
    }

    @DeleteMapping("/{ID}")
    public void delete(@PathVariable String ID){
        userService.delete(ID);
    }
    @GetMapping("/document")
    public List<String> show(){
        return userService.show();
    }

    @PutMapping("/document")
    public void read(@RequestBody String right){
        userService.read(right);
    }
}
