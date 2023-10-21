package com.example.tictactoepractice.service;

import com.example.tictactoepractice.models.BotDifficultyLevel;
import com.example.tictactoepractice.strategies.botstrategy.BotPlayingStrategy;
import com.example.tictactoepractice.strategies.botstrategy.BotPlayingStrategyFactory;
import com.example.tictactoepractice.strategies.winningstrategy.WinningRule;
import com.example.tictactoepractice.strategies.winningstrategy.WinningStrategy;
import com.example.tictactoepractice.strategies.winningstrategy.WinningStrategyFactory;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class UtilityService {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    private List<WinningStrategy> winningStrategies;

    UtilityService(BotPlayingStrategyFactory botPlayingStrategyFactory){
            winningStrategies = new ArrayList<>();
    }
    public  void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.botPlayingStrategy(botDifficultyLevel);
    }

    public void setWinningStrategy(WinningRule winningRule){
        winningStrategies.add(WinningStrategyFactory.setWinningRule(winningRule));
    }

}

