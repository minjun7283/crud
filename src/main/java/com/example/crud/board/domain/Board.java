package com.example.crud.board.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@AllArgsConstructor
@Entity
public class Board {
    @Id
    private String english;

    public Board() {

    }
}
