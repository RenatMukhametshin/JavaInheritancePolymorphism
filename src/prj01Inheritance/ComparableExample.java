package prj01Inheritance;

import prj01Inheritance.figures.Square;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        String first = "a";
        String second = "b";
        String third = "b";
        System.out.println(first + " compare to " + second + " " + first.compareTo(second));
        System.out.println(second + " compare to " + first + " " + second.compareTo(first));
        System.out.println(second + " compare to " + third + " " + second.compareTo(third));

        System.out.println("\nSquare compare example");
        TreeSet<Square> squares = new TreeSet<>();
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
