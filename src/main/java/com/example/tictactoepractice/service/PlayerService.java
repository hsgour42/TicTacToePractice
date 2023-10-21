package com.example.tictactoepractice.service;

import com.example.tictactoepractice.models.Game;
import com.example.tictactoepractice.models.Player;
import com.example.tictactoepractice.models.PlayerSymbol;
import com.example.tictactoepractice.models.PlayerType;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class PlayerService {
    private List<Player> players;
    PlayerService(){
        players = new ArrayList<>();
    }
    public void createPlayer(String name, PlayerType playerType, PlayerSymbol playerSymbol){
         Player player  = new Player();
         player.setName(name);
         player.setType(playerType);
         player.setSymbol(playerSymbol);
         players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }
}
