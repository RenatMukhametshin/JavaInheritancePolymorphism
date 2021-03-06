package prj01Inheritance.figures;

import java.awt.*;

public class Square extends Rectangle implements Comparable<Square> {
    public Square(double width, double height) {
        super(width, width);
    }

    public Square(double width) {
        super(width, width);
    }

    @Override
    public void setHeight(double height) {
        setHeight(height);
        setWidth(height);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
        setHeight(width);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public int compareTo(Square square) {
        if (getWidth() > square.getWidth()) {
            return -1;
        }
        if (getWidth() < square.getWidth()) {
            return 1;
        }
        return 0;
    }
}
