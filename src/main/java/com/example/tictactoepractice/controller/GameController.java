package com.example.tictactoepractice.controller;

import com.example.tictactoepractice.models.BotDifficultyLevel;
import com.example.tictactoepractice.service.GameService;
import com.example.tictactoepractice.strategies.winningstrategy.WinningStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class GameController {
    private GameService gameService;
    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }
    public void startGame(){
        gameService.startGame();
    }

    void makeMove(){}
    void undo(){}

    void gameStatus(){}
    void printResult(){}
}
