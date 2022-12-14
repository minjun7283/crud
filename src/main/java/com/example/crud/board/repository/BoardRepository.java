package com.example.crud.board.repository;


import com.example.crud.board.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardRepository {
    private static ArrayList<Board> boards;


    static {
        boards = new ArrayList<>();
        boards.add(new Board("inij"));
    }

    public void write(String board){
        boards.add(new Board(board));
    }
    public List<Board> raed(){
        return boards;
    }

    public void delete(String del){
        boards.removeIf(board -> board.getEnglish().equals(del));
    }
    public void deleteAll(){
        boards.removeAll(boards);
    }
}
