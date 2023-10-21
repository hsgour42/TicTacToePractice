package com.example.tictactoepractice.strategies.winningstrategy;

import java.util.ArrayList;
import java.util.List;

public class WinningStrategyFactory {

    public static WinningStrategy setWinningRule(WinningRule winningRule){
            return switch (winningRule){
                case COLUMN_CHECK -> new OneColumnWinningStrategy();
                case ROW_CHECK -> new OneRowWinningStrategy();
            };
    }
}
