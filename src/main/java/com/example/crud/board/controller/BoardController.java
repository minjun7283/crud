package com.example.crud.board.controller;


import com.example.crud.board.domain.Board;
import com.example.crud.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("")
    public List<Board> read(){
        return boardService.read();
    }

    @PutMapping("")
    public void write(@RequestBody String board){
        boardService.write(board);
    }

    @DeleteMapping("")
    public void delete(@RequestBody String del){
        boardService.delete(del);
    }

    @DeleteMapping("/delete")
    public void deleteAll(){
        boardService.deleteAll();
    }


}
