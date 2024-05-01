package gr.aueb.cf.ch6;

/**
 * Method that returns the second-smallest position in the
 * array.
 */
public class SecondLowestValuePositionApp {

    public static void main(String[] args) {
        int[] arr = {1111, 1, 2, 1, 1, 1, 65, 55, 1, 1, 600, 590, 900};
        int position = 0;
        int value = 0;

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] == arr[j - 1]) {
                    value = arr[j + 1];
                    position = j + 1;
                    break;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.printf("Second lowest value is: %d, at position: %d", value, (position + 1));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

