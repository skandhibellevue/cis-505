/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/
import java.text.SimpleDateFormat;
import java.util.*;

public class Transaction {

    // private properties
    public static final String DATE_PATTERN = "MM-dd-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Transaction.DATE_PATTERN);

    private String date = simpleDateFormat.format(new Date());
    private String description = "";
    private double amount = 0;

    // Constructor method that initialize private properties with default values
    public Transaction() {
        this.date = "";
        this.description = "";
        this.amount = 0;
    }

    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Accessor methods for the all class properties
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    // end Accessor methods

    // toString method
    public String toString() {
        return "Date: " + getDate() + "\nDescription: " + getDescription() + String.format("\nAmount: $%,6.2f", getAmount());
    } // end toString
} // end Product