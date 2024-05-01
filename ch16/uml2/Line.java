package gr.aueb.cf.ch16.uml2;

public class Line extends AbstractShape implements ILine {
    private double length;

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
