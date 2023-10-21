package com.example.tictactoepractice.service;

import com.example.tictactoepractice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GameService {
    private Game game;
    private PlayerService playerService;
    private BoardService boardService;
    private UtilityService utilityService;

    @Autowired
    public GameService(
            Game game,
            PlayerService playerService,
            BoardService boardService,
            UtilityService utilityService
    ){
        this.game = game;
        this.playerService = playerService;
        this.boardService = boardService;
        this.utilityService = utilityService;
    }

    public void startGame(){
        game.setPlayers(playerService.getPlayers());
        game.setBoard(boardService.getBoard());
        game.setBotDifficultyLevel(utilityService.getBotDifficultyLevel());
        game.setWinningStrategies(utilityService.getWinningStrategies());
        game.setStartTime(new Date());
        game.setCurrentPlayerIndex(0);
        game.setGameStatus(GameStatus.IN_PROGRESS);

        System.out.println();
    }






}
