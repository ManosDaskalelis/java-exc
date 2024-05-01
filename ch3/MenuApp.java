package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Menu εφαρμογής που δέχεται input από
 * stdin και εμφανίζει την επιλογή του
 * χρήστη.
 */
public class MenuApp {

    public static void main(String[] args) {
        int menuNum = 0;
        Scanner scanner = new Scanner(System.in);

        while (menuNum < 5) {
            System.out.println("Παρακαλώ επιλέξτε έναν αριθμό (1 - 5) για να κατευθυνθείτε στο μενού " +
                    "(1 = Εισαγωγή, 2 = Διαγραφή, 3 = Ενημέρωση, 4 = Αναζήτηση, 5 = Έξοδος");
            menuNum = scanner.nextInt();
            if (menuNum == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (menuNum == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (menuNum == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (menuNum == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }
            if (menuNum == 5) {
                System.out.println("Επιλέξατε Έξοδος");
            }
        }
    }
}
