package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class IOApp {
    public static void main(String[] args) {
        String line;
        String[] tokens;
        String firstname;
        String lastname;
        double average;
        int sum;
        int count = 2;

        try (Scanner in = new Scanner(new File("C:\\Users\\Manos\\Desktop\\in.txt"));
             PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\Manos\\Desktop\\primOut.txt"), true, StandardCharsets.UTF_8);
             PrintStream ps1 = new PrintStream(new FileOutputStream("C:\\Users\\Manos\\Desktop\\log.txt", true), true, StandardCharsets.UTF_8)) {

            while (in.hasNextLine()) {
                 line = in.nextLine();
                 tokens = line.split("\\s+");

                if (tokens.length == 4) {
                     firstname = tokens[0];
                     lastname = tokens[1];
                    int grade1 = Integer.parseInt(tokens[2]);
                    int grade2 = Integer.parseInt(tokens[3]);

                    if (isValidGrade(grade1) && isValidGrade(grade2)) {
                        sum = grade1 + grade2;
                        average = (double) sum / count;
                        ps.println(firstname + " " + lastname + " " + average);
                    } else {
                        ps1.println("Invalid grades for: " + firstname + " " + lastname + " " + grade1 + " " + grade2);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 10;
    }

}
