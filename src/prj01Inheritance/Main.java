package prj01Inheritance;

import prj01Inheritance.figures.Circle;
import prj01Inheritance.figures.Figure;
import prj01Inheritance.figures.Rectangle;
import prj01Inheritance.figures.Square;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(20);
        square.setColor(Color.BLACK);

        System.out.println(square.getColor());
        System.out.println(square);

        Figure figure = new Square(40.0);
        System.out.println(figure.getSquare());

        ArrayList<Figure> figuresList = new ArrayList<>();

        figuresList.add(new Circle(10.0));
        figuresList.add(new Square(25.0));
        figuresList.add(new Rectangle(30.0, 40.0));

        for(Figure object : figuresList){
            System.out.println(object.getClass() + ", square = " + object.getSquare());
        }




    }
}
