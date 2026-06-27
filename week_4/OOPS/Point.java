// Point.java
// Program to create a Point class with distance method

public class Point {
    // Coordinates as integers
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Setter for both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x (optional, but good practice)
    public int getX() {
        return x;
    }

    // Getter for y (optional)
    public int getY() {
        return y;
    }

    // Method to calculate distance between two points
    public double distance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method to display point details
    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    // Main method to test the Point class
    public static void main(String[] args) {
        // Create two points
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        // Display points
        p1.display();
        p2.display();

        // Calculate and display distance
        double distance = p1.distance(p2);
        System.out.println("Distance between p1 and p2: " + distance);

        // Test setters
        p1.setX(5);
        p1.setY(7);
        System.out.println("After setting p1 to (5,7):");
        p1.display();

        // Test setXY
        p2.setXY(1, 1);
        System.out.println("After setting p2 to (1,1):");
        p2.display();
    }
}