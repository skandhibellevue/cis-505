/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/

import java.util.*;

public class TestComposerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Composer App");

        // Create instance of Scanner class
        Scanner sc = new Scanner(System.in);

        // local variables to track user options
        int input = 0;
        MemComposerDao memComposerDao = new MemComposerDao();

        do {
            boolean isValid = false;

            while (!isValid) {
                // prints menu
                System.out.print(menu());

                if (sc.hasNextInt()) {
                    input = sc.nextInt();
                    isValid = true;
                } else {
                    System.out.println("\n Error! Invalid int value.\n");
                }
                sc.nextLine();
            }

            // switch case to identify the user input and execute the respective case
            switch (input) {
                case 1:
                    // get list of composers
                    List<Composer> composers = memComposerDao.findAll();

                    // check to see if the list is empty
                    if (composers.isEmpty()) {
                        System.out.println("\n--No Composers to display--\n");
                        continue;
                    }

                    // displays list of composers
                    System.out.println("\n--DISPLAYING COMPOSERS--");
                    composers.forEach(composer -> {
                        System.out.println(composer.toString() + "\n");
                    });
                    break;

                case 2: {
                    System.out.print("\nEnter an id: ");
                    int id = sc.nextInt();

                    // get selected Composer object
                    Composer composer = memComposerDao.findBy(id);

                    System.out.println("\n--DISPLAYING COMPOSER--");
                    System.out.println(composer.toString());
                    System.out.println();
                    break;
                }

                case 3: {
                    // get id, name and genre from user input
                    System.out.print("\nEnter an id: ");
                    int id = sc.nextInt();
                    System.out.print("\nEnter a name: ");
                    String name = sc.next();
                    System.out.print("\nEnter a genre: ");
                    String genre = sc.next();

                    // insert new Composer object to the list
                    memComposerDao.insert(new Composer(id, name, genre));
                    System.out.println();
                    break;
                }
            }
        } while (input != 4);

        System.out.println("\nProgram terminated by the user ...\n");
    } // end main

    /**
     * menu method, which is used to display menu
     * @return returns String
     */
    private static String menu() {
        return "\nMENU OPTIONS" +
                "\n1. View Composers" +
                "\n2. Find Composer" +
                "\n3. Add Composer" +
                "\n4. Exit\n" +
                "\nPlease choose an option: ";
    } // end menu
} // TestComposerApp