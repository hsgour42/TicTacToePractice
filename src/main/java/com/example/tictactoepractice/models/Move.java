package com.example.tictactoepractice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Move {
    private Player player;
    private Cell cell;
}
