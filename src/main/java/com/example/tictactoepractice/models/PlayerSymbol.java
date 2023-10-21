package com.example.tictactoepractice.models;

import lombok.Getter;
import lombok.Setter;

import java.security.PublicKey;

@Getter
@Setter
public  class PlayerSymbol {
    private String symbol;
    public PlayerSymbol(String symbol){
        this.symbol = symbol;
    }
}
