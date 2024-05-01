package gr.aueb.cf.ch12.point;

public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ(1, 5, 6);
        PointXYZ p2 = new PointXYZ(22, 333, 44);
        PointXYZ p3 = new PointXYZ(4, 5, 62);

        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
        System.out.println(p3.convertToString());
    }
}
