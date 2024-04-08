/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/ 
import java.util.*;

public class Ball extends Product {

    // private properties
    private String color = "";

    // Constructor method that initialize private properties with default values
    public Ball() {
        this.color = "";
    }

    // Accessor methods for the all class properties
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    // end Accessor methods

    // overridden toString method
    @Override
    public String toString() {
        return super.toString() + "\nColor: " + getColor();
    } // end toString
} // end Ball