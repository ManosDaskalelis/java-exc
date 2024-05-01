package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * An app that decrypts a string.
 */
public class decrypApp {

    public static void main(String[] args) {
        System.out.println(deCrypt(charInsertion()));
    }

    /**
     * A method that decrypts a string.
     *
     * @param charArray     the user's input.
     * @return              the decrypted string.
     */
    public static String deCrypt(char[] charArray){
        String str;

        if (charArray == null) {
            str = new String("1");
            return str;
        }
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] -= 1;
        }
        str = new String(charArray);
        return str;
    }

    /**
     * Inserts a string.
     *
     * @return      an char array.
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
