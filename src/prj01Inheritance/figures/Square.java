package prj01Inheritance.figures;

public class Square extends Rectangle{
    public Square(int width, int height) {
        super(width, width);
    }

    public Square(int width){
        super(width,width);
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        height = width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
