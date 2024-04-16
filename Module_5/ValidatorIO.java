/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/
import java.util.*;

public class ValidatorIO {

    /**
     * getInt method with two arguments, which is used to get int input from the user
     * @param Scanner sc, String prompt for displaying message
     * @return returns int
     */
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;

        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n Error! Invalid int value.\n");
            }
            sc.nextLine();
        }

        return input;
    } // end getInt

    /**
     * getDouble method with two arguments, which is used to get double input from the user
     * @param Scanner sc, String prompt for displaying message
     * @return returns double
     */
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;

        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("\n Error! Invalid double value.\n");
            }
            sc.nextLine();
        }

        return input;
    } // end getDouble

    /**
     * getString method with two arguments, which is used to get string input from the user
     * @param Scanner sc, String prompt for displaying message
     * @return returns String
     */
    public static String getString(Scanner sc, String prompt) {
        String input = "";
        System.out.print(prompt);
        input = sc.nextLine();
        return input;
    } // end getString
} // ValidatorIO
