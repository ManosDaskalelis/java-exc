package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δέχεται μια τιμή από το stdin
 * και εμφανίζει stars(*)
 * σε σχέση  1 : n.
 */
public class FourthForStarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert num");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
