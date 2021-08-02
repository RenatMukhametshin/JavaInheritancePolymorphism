package prj01Inheritance;

import prj01Inheritance.figures.Square;
import prj01Inheritance.figures.SquareComparator;

import java.util.TreeSet;

public class Comparator {
    public static void main(String[] args) {

        System.out.println("\nSquare comparator example");
        TreeSet<Square> squares = new TreeSet<>(new SquareComparator());
        squares.add(new Square(40));
        squares.add(new Square(20));
        squares.add(new Square(40));
        squares.add(new Square(40));
        squares.add(new Square(50));
        squares.add(new Square(10));

        for(Square square : squares){
            System.out.println("Square " + square.getWidth());
        }
    }
}
