package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δέχεται απο το stdin μια τιμή
 * και ανάλογα εμφανίζει οριζόντια
 * stars (*).
 */
public class FirstForStarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a num");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
    }
}
