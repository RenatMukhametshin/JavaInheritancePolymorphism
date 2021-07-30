package prj01Inheritance.figures;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSquare(){
        return width * height;
    }

    @Override
    public String toString() {
        return "width=" + this.width + ", height=" + this.height + ", square=" + getSquare();
    }
}
