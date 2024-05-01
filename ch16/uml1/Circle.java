package gr.aueb.cf.ch16.uml1;

public class Circle extends AbstractShape implements ITwoDimensional{
    private  double radius;

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
    public double getArea() {
        return Math.PI * radius;
    }
}
