package gr.aueb.cf.ch15;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

         p1.setX(3);
        ((Point2D)p2).setY(5);
        ((Point2D)p2).setX(10);
        ((Point3D)p3).setZ(10);
        ((Point3D)p3).setX(10);
        ((Point3D)p3).setY(10);

        System.out.println(PointUtil.distanceFromOrigin(p3));
    }
}
