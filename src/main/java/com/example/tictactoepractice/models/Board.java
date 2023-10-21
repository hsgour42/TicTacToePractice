package com.example.tictactoepractice.models;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class Board {
    public int size;
    public List<List<Cell>> board;
}
