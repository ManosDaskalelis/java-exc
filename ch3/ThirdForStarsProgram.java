package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Δέχεται απο το stdin μια τιμή
 *και ανάλογα εμφανίζει σε σχέση ( n X n)
 *stars (*).
 */
public class ThirdForStarsProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please insert first num");
        num1 = scanner.nextInt();

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
