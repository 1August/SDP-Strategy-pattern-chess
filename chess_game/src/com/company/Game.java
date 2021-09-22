package com.company;

import com.company.Figures.King;
import com.company.Figures.Knight;

public class Game {
    Figure knight = new Knight(3, 1);
    Figure king = new King(5, 1);

    void start() {
        System.out.println("Game started!\n-----");
        System.out.println("   _______________________");
        System.out.println("8 |__|__|__|__|__|__|__|__|");
        System.out.println("7 |__|__|__|__|__|__|__|__|");
        System.out.println("6 |__|__|__|__|__|__|__|__|");
        System.out.println("5 |__|__|__|__|__|__|__|__|");
        System.out.println("4 |__|__|__|__|__|__|__|__|");
        System.out.println("3 |__|__|__|__|__|__|__|__|");
        System.out.println("2 |__|__|__|__|__|__|__|__|");
        System.out.println("1 |__|__|__|__|__|__|__|__|");
        System.out.println("   1  2  3  4  5  6  7  8  \n");
    }
}