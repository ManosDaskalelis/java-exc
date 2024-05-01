package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * An app that encrypts a string.
 */
public class encryptionApp {

    public static void main(String[] args) {
        System.out.println("Please insert a string.");
        System.out.println(crypt(charInsertion()));
    }

    /**
     * Encrypts the given string.
     * @param charArray     the user's input.
     * @return              the encrypted string.
     */
    public static String crypt(char[] charArray) {
        String str;
        if (charArray == null) {
            str = new String("No input");
            return str;
        }
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] += 1;
        }
        str = new String(charArray);
        return str;
    }

    /**
     * Inserts a string.
     *
     * @return   returns a char array.
     */
    public static char[] charInsertion() {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();

        if (code.length() == 0) {
            return null;
        } else {
            char[] newCharArray = code.toCharArray();
            return newCharArray;
        }
    }
}
