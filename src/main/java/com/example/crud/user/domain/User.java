package com.example.crud.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class User {
    private String ID;
    private String name;
    private String userPw;

}