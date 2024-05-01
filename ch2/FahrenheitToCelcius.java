package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Πρόγραμμα που μετατρέπει
 * βαθμούς Fahrenheit σε
 * βαθμούς Celsius.
 */
public class FahrenheitToCelcius {

    public static void main(String[] args) {

        int Fahrenheit;
        int Celsius;

        System.out.println("Παρακαλώ εισάγετε θερμοκρασία σε Fahrenheit: ");
        Scanner temperature = new Scanner(System.in);

        Fahrenheit = temperature.nextInt();
        Celsius = 5 * (Fahrenheit - 32) / 9;
        
        System.out.printf("Η θερμοκρασία σε Celsius είναι: %d", Celsius);

    }
}
