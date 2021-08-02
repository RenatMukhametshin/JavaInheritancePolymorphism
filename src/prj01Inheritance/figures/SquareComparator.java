package prj01Inheritance.figures;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square square1, Square square2) {
        Double s1 = Double.valueOf(square1.getWidth());
        Double s2 = Double.valueOf(square2.getWidth());
        return -1 * s1.compareTo(s2);
    }
}
