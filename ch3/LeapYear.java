package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει από το stdin έναν αριθμό
 * και υπολογίζει αν το έτος είναι
 * δίσεκτος η όχι.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.println("Εισάγετε έτος: ");
        year = scanner.nextInt();
        if (year == 0) {
            System.out.printf("Το έτος %d δεν είναι δίσεκτο", year);
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("Το έτος %d είναι δίσεκτο", year);
        } else {
            System.out.printf("Το έτος %d δεν είναι δίσεκτο", year);
        }
    }
}
