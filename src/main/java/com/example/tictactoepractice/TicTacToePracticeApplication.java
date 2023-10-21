package com.example.tictactoepractice;

import com.example.tictactoepractice.controller.BoardController;
import com.example.tictactoepractice.controller.GameController;
import com.example.tictactoepractice.controller.PlayerController;
import com.example.tictactoepractice.controller.UtilityController;
import com.example.tictactoepractice.models.BotDifficultyLevel;
import com.example.tictactoepractice.models.Player;
import com.example.tictactoepractice.models.PlayerSymbol;
import com.example.tictactoepractice.models.PlayerType;
import com.example.tictactoepractice.strategies.winningstrategy.WinningRule;
import com.example.tictactoepractice.strategies.winningstrategy.WinningStrategy;
import com.example.tictactoepractice.strategies.winningstrategy.WinningStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TicTacToePracticeApplication implements CommandLineRunner {
    private GameController gameController;
    private BoardController boardController;
    private PlayerController playerController;
    private UtilityController utilityController;

    @Autowired
    public TicTacToePracticeApplication(
            GameController gameController,
            BoardController boardController,
            PlayerController playerController,
            UtilityController utilityController
    ){
        this.gameController = gameController;
        this.boardController = boardController;
        this.playerController = playerController;
        this.utilityController = utilityController;

    }

    @Override
    public void run(String... args) throws Exception {
        boardController.createBoard(3);
        playerController.CreatePlayer("Himanshu", PlayerType.HUMAN, new PlayerSymbol("X"));
        playerController.CreatePlayer("Harsh",PlayerType.BOT,new PlayerSymbol("O"));
        utilityController.setBotDifficultyLevel(BotDifficultyLevel.EASY);
        utilityController.setWinningStrategy(WinningRule.COLUMN_CHECK);
        utilityController.setWinningStrategy(WinningRule.ROW_CHECK);
        gameController.startGame();
        System.out.println();
    }

    public static void main(String[] args) {
        SpringApplication.run(TicTacToePracticeApplication.class, args);
    }

}
