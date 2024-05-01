package gr.aueb.cf.ch16.uml2;

public class Circle extends AbstractShape implements ICircle{
    private double radius;

    public Circle() {

    }

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public long getCircumference() {
        return (long)(2 * Math.PI * radius);
    }
}
