package com.company.Figures;

import com.company.Attacks.AttackByOne;
import com.company.Figure;
import com.company.Moves.KingMove;

public class King extends Figure {
    public King(int x, int y) {
        super("King", new KingMove(), new AttackByOne());
        this.setxCoord(x);
        this.setyCoord(y);
    }
}
