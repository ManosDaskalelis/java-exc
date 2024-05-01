package gr.aueb.cf.ch8;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * A menu app that prints the user's
 * choice and handles any exceptions that might
 * appear.
 */
public class MainMenuApp {

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nPlease insert a number to navigate the menu\n");
            menu();
            choice = getChoice();
            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Please insert a number (1 - 5)!");
            }
        }while (choice != 5);

    }

    /**
     * A method that prints the menu options.
     */
    public static void menu() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance Inquiry");
        System.out.println("4. Transfer & Payments");
        System.out.println("5. Exit");
    }

    /**
     * A method that inserts the user's input to the app.
     *
     * @return          the user's choice.
     */
    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        int userChoice = 0;

        while (true) {
            if (in.hasNextInt()) {
                userChoice = in.nextInt();
                in.nextLine();
            } else {
                System.out.println("Please insert a valid number");
                in.nextLine();
                continue;
            }
            break;
        }
        if (userChoice == 5) {
            in.close();
        }
        return userChoice;
    }

    /**
     * Prints a message according to the user's choice.
     *
     * @param choice                            the user's input.
     * @throws IllegalArgumentException         if the user inserted a number that does not
     *                                          correspond to a menu option.
     */
    public static void printChoice(int choice) throws IllegalArgumentException {
        switch (choice) {
            case 1:
                System.out.println("You chose Deposit");
                break;
            case 2:
                System.out.println("You chose Withdraw");
                break;
            case 3:
                System.out.println("You chose Balance Inquiry");
                break;
            case 4:
                System.out.println("You chose Transfer & Payments");
                break;
            case 5:
                System.out.println("You chose Exit");
                break;
        }
        try {
            if (choice < 1 || choice > 5) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong input!\n");
            throw e;
        }
    }
}
