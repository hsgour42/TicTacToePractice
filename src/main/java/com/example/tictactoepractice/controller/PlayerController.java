package com.example.tictactoepractice.controller;

import com.example.tictactoepractice.models.PlayerSymbol;
import com.example.tictactoepractice.models.PlayerType;
import com.example.tictactoepractice.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {
    private PlayerService playerService;
    @Autowired
    PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    public void CreatePlayer(String name,PlayerType playerType,PlayerSymbol playerSymbol){
        playerService.createPlayer(name,playerType,playerSymbol);
    }

}
