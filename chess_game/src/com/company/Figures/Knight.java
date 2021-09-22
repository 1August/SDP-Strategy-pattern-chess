package com.company.Figures;

import com.company.Attacks.AttackByTwo;
import com.company.Figure;
import com.company.Moves.KnightMove;

public class Knight extends Figure {
    public Knight(int x, int y) {
        super("Knight", new KnightMove(), new AttackByTwo());
        this.setxCoord(x);
        this.setyCoord(y);
    }
}
