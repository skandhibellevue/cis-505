/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/ 
import java.util.*;

public class Bag extends Product {

    // private properties
    private String bagType = "";

    // Constructor method that initialize private properties with default values
    public Bag() {
        this.bagType = "";
    }

    // Accessor methods for the all class properties
    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getBagType() {
        return bagType;
    }
    // end Accessor methods

    // overridden toString method
    @Override
    public String toString() {
        return super.toString() + "\nType: " + getBagType();
    } // end toString
} // end Bag