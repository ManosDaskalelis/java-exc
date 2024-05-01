package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        Scanner date = new Scanner(System.in);
        System.out.println("Παρακαλώ δώστε έναν αριθμό για να ορίσετε ημέρα: ");
        day = date.nextInt();
        System.out.println("Παρακαλώ δώστε έναν αριθμό για να ορίσετε μήνα: ");
        month = date.nextInt();
        System.out.println("Παρακαλώ δώστε έναν αριθμό για να ορίσετε χρονία: ");
        year = date.nextInt();
        System.out.printf("Η ημερομηνία που δώσατε είναι: %02d/%02d/%d", day, month, year%100);
    }
}
