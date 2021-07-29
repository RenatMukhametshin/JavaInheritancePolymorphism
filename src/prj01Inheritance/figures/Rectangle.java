package prj01Inheritance.figures;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSquare(){
        return width * height;
    }

    @Override
    public String toString() {
        return "width=" + this.width + ", height=" + this.height + ", square=" + getSquare();
    }
}
