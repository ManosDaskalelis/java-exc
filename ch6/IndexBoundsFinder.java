package gr.aueb.cf.ch6;

import javax.management.MBeanRegistration;

public class IndexBoundsFinder {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        var minMaxPositionArray = getLowAndHighIndexOf(arr, 8);

        if (minMaxPositionArray[0] == - 1) {
            System.out.print("Wrong key chosen");
            return;
        }

        for (int item : minMaxPositionArray) {
            System.out.print((item + 1) + " ");
        }
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] boundsArray = {-1, -1};
        if (arr == null) return null;

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                boundsArray[0] = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (key == arr[i]) {
                boundsArray[1] = i;
                break;
            }
        }
        return boundsArray;
    }
}
