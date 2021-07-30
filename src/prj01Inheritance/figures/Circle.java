package prj01Inheritance.figures;

import java.awt.*;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        setColor(Color.CYAN);
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
