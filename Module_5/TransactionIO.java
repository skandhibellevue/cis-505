/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class TransactionIO {

    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(TransactionIO.FILE_NAME);

    /**
     * bulkInsert method with one argument, which is used to insert list of transactions to file
     * @param ArrayList of Transaction class objects
     * @return returns void
     * @throws IOException when there is an error in accessing the file
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        try {
            // Checks if file exists or not
            if (file.exists()) {
                output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
            } else {
                output = new PrintWriter(FILE_NAME);
            }

            // Iterate through list of transactions and write them to the file
            for (Transaction tran : transactions) {
                output.print(tran.getDate() + " ");
                output.print(tran.getDescription() + " ");
                output.println(tran.getAmount());
            }

            output.close();
        } catch (IOException exception) {
            System.out.println("Unable to access file.");
        }
    }

    /**
     * findAll method, which is used to return list of transactions from file
     * @return returns an ArrayList of Transaction objects
     * @throws IOException when there is an error if there are no transactions to view
     */
    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();

        try {
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String date = input.next();
                String description = input.next();
                double amount = input.nextDouble();
                
                Transaction transaction = new Transaction(date, description, amount);
                transactions.add(transaction);
            }
        } catch (Exception ex) {
            System.out.println("\nNo transactions to view.\n");
        }

        return transactions;
    } // end findAll
} // end TransactionIO
