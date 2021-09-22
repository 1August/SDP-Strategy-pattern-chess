package com.company;

import com.company.Interfaces.IAttack;
import com.company.Interfaces.IMove;

public abstract class Figure {
    private String name;
    private int xCoord;
    private int yCoord;
    private IMove imove;
    private IAttack iattack;

    public Figure(String name, IMove imove, IAttack iattack) { this.name = name; this.imove = imove; this.iattack = iattack; }

    void moveTo(int x, int y){
        if (xCoord != x || yCoord != y){
            imove.moveTo(this, x, y);
        } else {
            System.out.println("Can't move there");
        }
    }

    void attack(int x, int y){
        if (x > 0 && y > 0) iattack.attack(this, x, y);
    }

    public void setIattack(IAttack iattack) { this.iattack = iattack; }
    public void setImove(IMove imove) { this.imove = imove; }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getxCoord() { return xCoord; }
    public void setxCoord(int xCoord) { this.xCoord = xCoord; }
    public int getyCoord() { return yCoord; }
    public void setyCoord(int yCoord) { this.yCoord = yCoord; }
}
