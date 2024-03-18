/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/ 
import java.util.*;

public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    // Constructors
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }
    
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    // Accessor methods
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean isOn() {
        return on;
    }
    
    public void setOn(boolean on) {
        this.on = on;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan Color: " + color + ", Radius: " + radius + ", Fan is off";
        }
    } // end toString
} // end Fan
