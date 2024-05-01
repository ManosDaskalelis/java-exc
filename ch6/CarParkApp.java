package gr.aueb.cf.ch6;

/**
 * Counts the max number of cars that were parked
 * at the same time.
 */
public class CarParkApp {
    public static int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020},};

    public static void main(String[] args) {
        int maxParked = arrayMethod(arr);
        if (maxParked == -1) {
            System.out.print("Wrong input");
        } else {
            System.out.println();
            System.out.println("The max number of cars parked at the same time is " + arrayMethod(arr));
        }
    }

    /**
     * Creates a new array base on the given and
     * as a second element in each nested array
     * places an 1 if its arrival or -1 if its
     * departure, then it calculates how many
     * cars are parked at the same time.
     *
     * @param arr       the given array.
     * @return          the max number of
     *                  parked cars or -1
     *                  if the input is wrong.
     */
    public static int arrayMethod(int[][] arr) {
        int[][] formattedArray = new int[arr.length * 2][2];
        int arrivals = 1;
        int departures = -1;
        int difference = 0;
        int maxParked = 0;

        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length !=2) return -1;
            formattedArray[i * 2] = new int[]{arr[i][0], arrivals};
            formattedArray[i * 2 + 1] = new int[]{arr[i][1], departures};
        }
        bubbleSort(formattedArray);

        for (int[] count : formattedArray) {
           difference += count[1];
           if (difference > maxParked)
               maxParked = difference;
        }

        return maxParked;
    }

    /**
     * Sorts the given array.
     * @param arr   the given array.
     */
    public static void bubbleSort(int[][] arr) {
        int n = arr.length;
        int[] tmp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
        }
    }
}
