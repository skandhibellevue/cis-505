/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/ 
import java.util.*;

public class TestFanApp {
    public static void main(String[] args) {
        // Creating two instances of Fan
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8.0, "blue");
        
        // Displaying the objects
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
