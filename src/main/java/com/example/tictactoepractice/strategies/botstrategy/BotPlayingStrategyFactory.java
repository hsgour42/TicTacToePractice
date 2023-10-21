package com.example.tictactoepractice.strategies.botstrategy;

import com.example.tictactoepractice.models.BotDifficultyLevel;
import org.springframework.stereotype.Controller;

@Controller
public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy botPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        return switch (botDifficultyLevel) {
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
        };
    }
}
