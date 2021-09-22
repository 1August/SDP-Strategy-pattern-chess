package com.company;

import com.company.Attacks.AttackByTwo;
import com.company.Moves.KingMove;
import com.company.Moves.KnightMove;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();

        System.out.println("\nKing at " + game.king.getxCoord() + " " + game.king.getyCoord());
        game.king.moveTo(5, 2);
        game.king.moveTo(4, 4);
        game.king.setImove(new KnightMove());
        game.king.moveTo(4, 4);

        System.out.println("\nKnight at " + game.king.getxCoord() + " " + game.king.getyCoord());
        game.knight.moveTo(4, 3);
        game.knight.moveTo(5, 2);
        game.knight.setImove(new KingMove());
        game.king.moveTo(5, 2);

        System.out.println("\nKing at " + game.king.getxCoord() + " " + game.king.getyCoord());
        game.king.attack(5, 2);
        game.king.attack(3, 4);
        game.king.setIattack(new AttackByTwo());
        game.king.attack(3, 4);

        System.out.println("\nKnight at " + game.knight.getxCoord() + " " + game.knight.getyCoord());
        game.knight.attack(2, 1);
        game.knight.attack(1, 6);
    }
}
