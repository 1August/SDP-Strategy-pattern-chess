package com.company.Moves;

import com.company.Figure;
import com.company.Interfaces.IMove;

public class KnightMove implements IMove {
    @Override
    public void moveTo(Figure figure, int x, int y) {
        if (x > 0 && x <= 8 && y > 0 && y <= 8 &&
                (
                    (Math.abs(figure.getxCoord()-x) == 2 && Math.abs(figure.getyCoord()-y) == 1) ||
                    (Math.abs(figure.getxCoord()-x) == 1 && Math.abs(figure.getyCoord()-y) == 2)
                ))
        {
            figure.setxCoord(x);
            figure.setyCoord(y);
            System.out.println(figure.getName() + " moved to " + x + " and " + y);
        } else {
            System.out.println(figure.getName() + " can't move to " + x + " and " + y);
        }
    }
}
