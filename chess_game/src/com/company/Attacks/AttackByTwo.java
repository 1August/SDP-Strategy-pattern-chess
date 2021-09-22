package com.company.Attacks;

import com.company.Figure;
import com.company.Interfaces.IAttack;

public class AttackByTwo implements IAttack {
    @Override
    public void attack(Figure figure, int x, int y) {
        IAttack.checkAttack(figure, x, y, 2);
    }
}
