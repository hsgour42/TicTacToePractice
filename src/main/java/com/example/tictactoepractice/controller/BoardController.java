package com.example.tictactoepractice.controller;

import com.example.tictactoepractice.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {
    private BoardService boardService;
    @Autowired
    BoardController(BoardService boardService){
        this.boardService = boardService;
    }

    public void createBoard(int size){
        boardService.createBoard(size);
    }

    public void printBoard(){
        boardService.printBoard();
    }


}
