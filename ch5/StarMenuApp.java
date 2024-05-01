package gr.aueb.cf.ch5;

import java.util.List;
import java.util.Scanner;

/**
 * Ένα Menu App που δέχεται από το stdin έναν
 * int για επιλόγη (menu navigation) και μέτα
 * έναν δεύτερο int και ανάλογα εκτυπώνει αστεράκια (*).
 */
public class StarMenuApp {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int choice = 0;
        int num = 0;

            do {
                System.out.println("PLEASE INSERT A NUMBER TO NAVIGATE THE MENU");
                System.out.println();
                menuNav();
                choice = menuChoice(choice);

                if (choice < 1 || choice > 6) {
                    System.out.println("Λάθος επιλογή");
                    continue;
                }

                switch (choice) {
                    case 1:
                        starPrinting();
                        break;
                    case 3:
                        starPrinting();
                        break;
                    case 4:
                        starPrinting();
                        break;
                    case 5:
                        starPrinting();
                        break;
                    default:
                        System.out.println("ερρορ");
                }

                starPrinting();
                System.out.println();

            } while (choice != 6);
    }

    /**
     * Menu Structure.
     */
    public static void menuNav(){
        System.out.println("1. Prints stars (*) in a horizontal format");
        System.out.println("2. Prints stars (*) in a vertical format");
        System.out.println("3. Prints stars (*) in a (n X n) format");
        System.out.println("4. Prints stars (*) in a (1 - n) format");
        System.out.println("5. Prints stars (*) in a (n - 1) format");
        System.out.println("6. Exit");
    }

    /**
     *  Μέθοδος που δέχεται από το stdin ένα int για επιλογή menu.
     *
     * @param choice   το int.
     * @return         επιστρέφει την επιλογή.
     */
    public static int menuChoice(int choice) {
        choice = scanner.nextInt();

        return choice;
    }

    public static void starPrinting() {
        int num = scanner.nextInt();

        switch (num){
            case 1:
                for (int i = 1; i <= num; i++){
                    System.out.println("*");

                }break;
            case 3:
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= num; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }break;
            case 4:
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }break;
            case 5:
                for (int i = 1; i <= num; i++) {
                    for (int j = num; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }break;
            default:
                System.out.println("Λάθος Επιλογή");
        }

    }


}
