package com.company.Interfaces;

import com.company.Figure;

public interface IAttack {
    void attack(Figure figure, int x, int y);

    static void checkAttack(Figure figure, int x, int y, int step){
        if (Math.abs(figure.getxCoord()-x) <= step && Math.abs(figure.getyCoord()-y) <= step){
            System.out.println(figure.getName() + " attacking " + x + " and " + y);
        } else {
            System.out.println("So far!");
        }
    }
}
