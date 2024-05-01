package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Asks the users to insert six (6) numbers
 * and checks if they fulfill some
 * criteria.
 */
public class SixNumbersApp {

    static Scanner scanner = new Scanner(System.in);
     static  int[] numbers = new int[6];

    public static void main(String[] args) {

        do {
            System.out.println("\nPlease insert 6 numbers that fulfill the criteria\n\n");
            criteria();
            System.out.println();
            arrayNumberInsertion();
            System.out.println();
            printNumbers();
        }while (validationCheck());

        System.out.println();
        System.out.println("The numbers you inserted fulfill the criteria!!");
    }

    /**
     * Checks if the numbers inserted by the user are fulfilling
     * the first criteria and if they do they get passed in
     * the array.
     */
    public static void  arrayNumberInsertion() {
        int[] scannedNumbers = new int[6];
        int pivot = 0;

        for (int i = 0; i < numbers.length; i++) {
            scannedNumbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (scannedNumbers[i] < 1 || scannedNumbers[i] > 49) {
                System.out.println("\nThe numbers you inserted do not fulfill the criteria\n");
               break;
            }else {
                numbers[pivot++] = scannedNumbers[i];
            }
        }
    }

    /**
     * Prints the inserted numbers
     */
    public static void printNumbers() {
        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }

    /**
     * Checks if the element in the array is even.
     * If there are more than 3 evens it returns true
     * otherwise false.
     *
     * @param array     the parameter array.
     * @return          true if evens > 3
     *                  false otherwise.
     */
    public static boolean isEven(int[] array) {
        if (array == null) return false;
        int evens = 0;

        for (int item : array) {
            if (item % 2 == 0) {
                evens++;
            }
        }

        return (evens > 3);
    }

    /**
     * Checks if the element in the array is odd.
     * If there are more than 3 it returns true
     * otherwise false.
     *
     * @param array         the parameter array.
     * @return              true if odds > 3
     *                      false otherwise.
     */
    public static boolean isOdd(int[] array) {
        if (array == null) return false;
        int odds = 0;

        for (int item : array) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return (odds > 3);
    }

    /**
     * Checks if an array has 3 or more consecutive elements in it.
     * If it does it, return true otherwise false.
     *
     * @param array     the parameter array.
     * @return          true if consecutives > 3 false otherwise.
     */
    public static boolean moreThanThreeConsecutives(int[] array) {
        if (array == null) return false;


        for (int i = 0; i < array.length - 3; i++) {
            if ((array[i] == array[i + 1] - 1) && (array[i] == array[i + 2] - 2) && (array[i] == array[i + 3] - 3)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if an array has three or more elements that end
     * with the same digit. If yes return true, otherwise false.
     *
     * @param array         the parameter array.
     * @return              true if hasSameEnding > 3 otherwise
     *                      false.
     */
    public static boolean moreThanThreeSameEndings(int[] array) {
        if (array == null) return false;
        int[] endings = new int[10];
        boolean hasSameEnding = false;

        for (int item : array) {
            endings[item % 10]++;
        }
        for (int item : endings) {
            if (item > 3 ) {
               hasSameEnding = true;
               break;
            }
        }
        return hasSameEnding;
    }

    /**
     * Checks if the elements of the array start with the same digit.
     * If yes return true otherwise false.
     * @param array         the parameter array.
     * @return              true if there are more than 3 same
     *                      starting digits false otherwise.
     */
    public static boolean moreThanThreeSameStartingDigits(int[] array) {
        if (array == null) return false;
        int[] startingDigits = new int[5];
        boolean hasSameStart = false;

        for (int item : array) {
            startingDigits[item / 10]++;
        }
        for (int item : startingDigits) {
            if (item > 3) {
                hasSameStart = true;
                break;
            }
        }
        return hasSameStart;
    }

    /**
     * Checks if the array  complies with
     * the criteria.
     * @return      true if it complies with the criteria
     *              otherwise false;
     */
    public static boolean validationCheck() {
        boolean isValidated = true;
        if (!isEven(numbers) && !isOdd(numbers) && !moreThanThreeConsecutives(numbers) && !moreThanThreeSameEndings(numbers) && !moreThanThreeSameStartingDigits(numbers)) {
            isValidated = false;
        }
        return isValidated;
    }

    /**
     * Criteria information.
     */
    public static void criteria() {
        System.out.println("Only numbers 1 - 49 are valid");
        System.out.println("No more than 3 even numbers");
        System.out.println("No more than 3 odd numbers");
        System.out.println("No more than 3 consecutive numbers");
        System.out.println("No more than 3 numbers that end with the same digit");
        System.out.println("No more than 3 numbers that start with the same digit");
    }
}
