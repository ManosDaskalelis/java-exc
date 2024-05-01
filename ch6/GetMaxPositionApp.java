package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * An app that finds the max position of an array.
 */
public class GetMaxPositionApp {


    public static void main(String[] args) {
        int[] arr = {1111, 55, 65, 1, 211, 590, 1900};
        getMaxPosition(arr, 0, arr.length - 1);

    }

    /**
     * Method that finds the max value in an array and returns
     * its position.
     *
     * @param arr       the input array.
     * @return          the position with the
     *                  max value.
     */
    public static void getMaxPosition(int[] arr, int low, int high) {
        if (arr == null) return;
        if (low < 0 || high > arr.length - 1) return;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        System.out.printf("Max position is : %d, max value is: %d", maxPosition, maxValue);
    }
}
