package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Δέχεται από το stdin ένα int για navigation σε ένα μενού
 * και ένα δεύτερο int για να κάνει print stars (*) ανάλογα.
 */
public class StarPrintingMethodApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int num = 0;

        do {
            menuNav();
            System.out.println();
            choice = userInput();

            if (choice < 1 || choice > 6) {
                System.out.println("Wrong choice.");
                continue;
            }

            switch (choice) {
                case 1:
                    starPrintingMethodGeneral(1);
                    break;
                case 2:
                    System.out.println("Please insert a number to print vertical stars (*)");
                    starPrintingMethodVert();
                    break;
                case 3:
                    starPrintingMethodGeneral(3);
                    break;
                case 4:
                    starPrintingMethodGeneral(4);
                    break;
                case 5:
                    starPrintingMethodGeneral(5);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }


        } while (choice != 6);

    }

    /**
     * Menu.
     */
    public static void menuNav() {
        System.out.println("\n\nPlease insert a number 1 - 6 to navigate the menu\n");
        System.out.println("1. Prints stars (*) in a horizontal format");
        System.out.println("2. Prints stars (*) in a vertical format");
        System.out.println("3. Prints stars (*) in a (n X n) format");
        System.out.println("4. Prints stars (*) in a (1 - n) format");
        System.out.println("5. Prints stars (*) in a (n - 1) format");
        System.out.println("6. Exit");
    }

    /**
     * Μέθοδος που δέχεται τις επιλογές του χρήστη από το stdin.
     */
    public static int userInput() {
        return scanner.nextInt();
    }

    /**
     * Μέθοδος που δέχεται στο σώμα της αλλές μεθόδους και αναλόγα το user choice
     * κάνει print stars(*).
     * @param choice  η επιλογή του χρήστη.
     * @return        επιστρέφει το αποτέλεσμα
     */
    public static int starPrintingMethodGeneral(int choice) {

            switch (choice) {
                case 1:
                System.out.println("Please insert a number for horizontal stars (*)");
                int num = userInput();
                for (int i = 1; i <= num; i++) {
                    System.out.print("*");
                } break;
                case 3:
                    System.out.println("Please insert number for (n X n) stars (*)");
                    starPrintingMethodTable();
                    break;
                case 4:
                    System.out.println("Please insert number for (1 - n) stars (*)");
                    starAscending();
                    break;
                case 5:
                    System.out.println("Please insert number for (n - 1) stars (*)");
                    starDescending();
                    break;
            }
            return choice;
    }

    /**
     * Μέθοδος που εκτυπώνει κάθετα stars(*).
     */
    public static void starPrintingMethodVert() {
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
    }

    /**
     * Μέθοδος που εκτυπώνει (n X n) stars(*).
     */
    public static void starPrintingMethodTable() {
        int num = userInput();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Μέθοδος που εκτυπώνει (1 - n ) stars(*).
     */
    public static void starAscending() {
        int num = userInput();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Μέθοδος που εκτυπώνει ( n - 1) stars(*).
     */
    public static void starDescending() {
        int num = userInput();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
