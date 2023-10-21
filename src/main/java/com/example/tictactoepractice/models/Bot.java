package com.example.tictactoepractice.models;

import com.example.tictactoepractice.strategies.botstrategy.BotPlayingStrategy;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
}
