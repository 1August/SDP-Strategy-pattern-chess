package com.company.Attacks;

import com.company.Figure;
import com.company.Interfaces.IAttack;

public class AttackByOne implements IAttack {
    @Override
    public void attack(Figure figure, int x, int y) {
        IAttack.checkAttack(figure, x, y, 1);
    }
}
