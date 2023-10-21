package com.example.tictactoepractice.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Player {
    private String name;
    private PlayerType type;
    private PlayerSymbol symbol;
}
