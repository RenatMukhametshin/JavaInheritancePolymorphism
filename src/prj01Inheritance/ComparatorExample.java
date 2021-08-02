package prj01Inheritance;

import prj01Inheritance.figures.Square;
import prj01Inheritance.figures.SquareComparator;

import java.util.TreeSet;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {

        System.out.println("\nSquare comparator lambda example");

        TreeSet<Square> squaresOther = new TreeSet<>((square1, square2) -> {
            Double s1 = Double.valueOf(square1.getWidth());
            Double s2 = Double.valueOf(square2.getWidth());
            return s1.compareTo(s2);
        });

        squaresOther.add(new Square(400));
        squaresOther.add(new Square(20000));
        squaresOther.add(new Square(4000));
        squaresOther.add(new Square(400));
        squaresOther.add(new Square(5000));
        squaresOther.add(new Square(10000));

        for(Square square : squaresOther){
            System.out.println(square.getWidth());
        }

    }
}
