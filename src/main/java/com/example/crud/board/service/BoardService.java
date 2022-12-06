package com.example.crud.board.service;


import com.example.crud.board.domain.Board;
import com.example.crud.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public void write(String board){
        boardRepository.write(board);
    }
    public List<Board> read(){
        return boardRepository.raed();
    }
    public void delete(String del){
        boardRepository.delete(del);
    }
    public void deleteAll(){
        boardRepository.deleteAll();
    }
}
