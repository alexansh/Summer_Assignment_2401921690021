// Box3D.java
// Derived class representing a 3D box, extends Box

public class Box3D extends Box {
    // Additional dimension
    private double height;

    // Default constructor
    public Box3D() {
        super(); // Call base class default constructor
        this.height = 0;
    }

    // Parameterized constructor
    public Box3D(double length, double breadth, double height) {
        super(length, breadth); // Call base class parameterized constructor
        this.height = height;
    }

    // Set method for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Override setDimensions to include height
    public void setDimensions(double length, double breadth, double height) {
        super.setDimensions(length, breadth); // Call base class method
        this.height = height;
    }

    // Method to calculate volume
    public double getVolume() {
        return super.getArea() * height; // area * height
    }

    // Override display to include height and volume
    @Override
    public void display() {
        super.display(); // Call base class display
        System.out.println("Height: " + height);
        System.out.println("Volume: " + getVolume());
    }

    // Main method to test Box and Box3D
    public static void main(String[] args) {
        System.out.println("=== Testing Box ===");
        Box box = new Box(5.0, 3.0);
        box.display();
        System.out.println();

        System.out.println("=== Testing Box3D ===");
        Box3D box3d = new Box3D(4.0, 3.0, 2.0);
        box3d.display();
        System.out.println();

        // Test setting dimensions
        System.out.println("After setting new dimensions:");
        box3d.setDimensions(6.0, 4.0, 3.0);
        box3d.display();
    }
}