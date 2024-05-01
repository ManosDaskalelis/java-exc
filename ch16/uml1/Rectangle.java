package gr.aueb.cf.ch16.uml1;

public class Rectangle extends AbstractShape implements ITwoDimensional{
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
