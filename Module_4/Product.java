/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/

public class Product {

    // private properties
    private String code = "";
    private String description = "";
    private double price = 0;

    // Constructor method that initialize private properties with default values
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0;
    }

    // Accessor methods for the all class properties
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    // end Accessor methods

    // toString method
    public String toString() {
        return "Product code: " + getCode() + "\nDescription: " + getDescription() + String.format("\nPrice: $%,6.2f", getPrice());
    } // end toString
} // end Product