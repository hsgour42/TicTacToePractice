package com.example.tictactoepractice.controller;

import com.example.tictactoepractice.models.BotDifficultyLevel;
import com.example.tictactoepractice.service.UtilityService;
import com.example.tictactoepractice.strategies.winningstrategy.WinningRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UtilityController {
    private UtilityService utilityService;
    @Autowired
    UtilityController(UtilityService utilityService){
        this.utilityService = utilityService;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        utilityService.setBotDifficultyLevel(botDifficultyLevel);
    }
    public void setWinningStrategy(WinningRule winningRule){
        utilityService.setWinningStrategy(winningRule);
    }


}
