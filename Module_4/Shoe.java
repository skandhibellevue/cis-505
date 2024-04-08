/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/ 
import java.util.*;

public class Shoe extends Product {

    // private properties
    private double size = 0;

    // Constructor method that initialize private properties with default values
    public Shoe() {
        this.size = 0;
    }

    // Accessor methods for the all class properties
    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
    // end Accessor methods

    // overridden toString method
    @Override
    public String toString() {
        return super.toString() + "\nSize: " + getSize();
    } // end toString
} // end Shoe