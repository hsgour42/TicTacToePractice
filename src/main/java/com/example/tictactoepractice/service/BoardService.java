package com.example.tictactoepractice.service;

import com.example.tictactoepractice.models.Board;
import com.example.tictactoepractice.models.Cell;
import com.example.tictactoepractice.models.CellStatus;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class BoardService {
     private Board board;
     @Autowired
     public BoardService(Board board){
         this.board = board;
     }
    public void createBoard(int size){
        List<List<Cell>> newBoard = new ArrayList<>();
        for(int row = 0 ; row < size ; row++){
            List<Cell> currentRow = new ArrayList<>();
            for(int col = 0 ; col < size; col++){
                Cell cell = new Cell(row,col);
                currentRow.add(cell);
            }
            newBoard.add(currentRow);
        }
        board.setBoard(newBoard);
        board.setSize(size);
    }

    public void printBoard(){
        for(List<Cell> row : board.getBoard()){
            printCell(row);
        }
    }

    public void printCell(List<Cell> cells){
         for(Cell cell : cells){
             System.out.print(" | ");
             if(cell.getStatus().equals(CellStatus.EMPTY)){
                 System.out.print(" - ");
             }else if(cell.getStatus().equals(CellStatus.BLOCKED)){
                 System.out.print(" * ");
             }else{
                 System.out.print(" + ");
             }
             System.out.print(" | ");
         }
        System.out.println();

    }

}
