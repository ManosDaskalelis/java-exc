package gr.aueb.cf.ch12.point;

/**
 * This class is a Javabean that includes the {@link #x},
 * {@link #y}, {@link #z} and a public API {@link #convertToString()}.
 *
 * @author Manos
 * @since 1.0
 * @version 2.0
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    /**
     * This is the <b>default constructor</b>.
     * It creates a default {@link PointXYZ} instance.
     */
    public PointXYZ() {

    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     *
     * @return
     */
    public String convertToString() {
        return "(" + x + ", " + y + ", " + z +")";
    }
}
