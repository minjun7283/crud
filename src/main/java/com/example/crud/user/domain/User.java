package com.example.crud.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter @Getter
@AllArgsConstructor
@Entity
public class User {
    @Id
    private String ID;
    private String name;
    private String userPw;

    public User() {

    }
}