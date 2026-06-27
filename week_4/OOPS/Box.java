// Box.java
// Base class representing a box with length and breadth

public class Box {
    // Dimensions
    protected double length;
    protected double breadth;

    // Default constructor
    public Box() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Set methods for dimensions
    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double getArea() {
        return length * breadth;
    }

    // Method to display dimensions and area
    public void display() {
        System.out.println("Box Dimensions:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + getArea());
    }
}