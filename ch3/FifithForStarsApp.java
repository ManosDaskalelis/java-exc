package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δέχεται μια τιμή από το stdin
 * και εμφανίζει stars(*)
 * σε σχέση  n : 1.
 */
public class FifithForStarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a num");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
