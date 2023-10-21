package com.example.tictactoepractice.models;

import com.example.tictactoepractice.strategies.winningstrategy.WinningStrategy;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Component
public class Game {
    private int currentPlayerIndex;
    private Player winner;
    private Date startTime;
    private GameStatus gameStatus;
    private Board board;
    private BotDifficultyLevel botDifficultyLevel;
    private List<Player> players;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
}


