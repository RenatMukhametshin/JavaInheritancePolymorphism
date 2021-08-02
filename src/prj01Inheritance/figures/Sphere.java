package prj01Inheritance.figures;

public class Sphere extends Figure3D{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getVolume() {
        return 4.0/3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceSquare() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWidth() {
        return 0;
    }
}
