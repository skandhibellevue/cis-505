/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/
import java.io.IOException;
import java.util.*;

public class TestExpenseTracker {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Expense Tracker");

        // Create instance of Scanner class
        Scanner sc = new Scanner(System.in);

        // local variables to track user options
        String option = "y";
        int input;

        do {
            // prints menu
            input = ValidatorIO.getInt(sc, menu()); 

            // create empty array list of transactions
            ArrayList<Transaction> transactions = new ArrayList<>();

            if (input == 1) { // Prints all transactions from the file
                transactions = TransactionIO.findAll();
                for (Transaction transaction: transactions) {
                    System.out.println(transaction.toString() + "\n");
                }
            } else if (input == 2) { // Inserts new transactions to the file
                String c = "y";

                do {
                    String description = ValidatorIO.getString(sc, "Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "Enter the amount: ");

                    transactions.add(new Transaction(description, amount));

                    c = ValidatorIO.getString(sc, "Add another transaction? (y/n): ");
                } while (!c.equalsIgnoreCase("n"));
                
                try {
                    TransactionIO.bulkInsert(transactions);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } else if (input == 3) { // Displays total monthly expense amount
                transactions = TransactionIO.findAll();
                double totalAmount = transactions.stream().mapToDouble(Transaction::getAmount).sum();
                System.out.println("Your monthly expense is " + String.format("\nAmount: $%,6.2f", totalAmount));
                System.out.println();
            }

            option = ValidatorIO.getString(sc, "Continue? (y/n): ");
        } while (!option.equalsIgnoreCase("n"));

        System.out.println("\nProgram terminated by the user ...\n");
    } // end main
    
    /**
     * menu method, which is used to display menu
     * @return returns String
     */
    private static String menu() {
        return "\nMENU OPTIONS" + 
        "\n1. View Transactions" + 
        "\n2. Add Transactions" + 
        "\n3. View Expense" + 
        "\nPlease choose an option: ";
    } // end menu
} // end TestExpenseTracker
