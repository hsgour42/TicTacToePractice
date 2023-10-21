package com.example.tictactoepractice.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class Cell {
    private int row;
    private int col;
    private CellStatus status;
    private Player player;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.status = CellStatus.EMPTY;
    }
}

