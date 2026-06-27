// OuterInnerClasses.java
// Program to demonstrate outer and inner classes

// Outer class
class Outer {
    // Instance variable of outer class
    private int outerVar = 100;

    // Method display in outer class
    public void display() {
        System.out.println("Display method of outer class");
        System.out.println("Outer class variable: " + outerVar);
    }

    // Inner class
    class Inner {
        // Instance variable of inner class
        private int innerVar = 200;

        // Method display in inner class
        public void display() {
            System.out.println("Display method of inner class");
            System.out.println("Inner class variable: " + innerVar);
            // Accessing outer class variable
            System.out.println("Accessing outer class variable from inner: " + outerVar);
        }
    }
}

// Main class to test outer and inner classes
public class OuterInnerClasses {
    public static void main(String[] args) {
        // Create object of outer class
        Outer outer = new Outer();
        // Call display method of outer class
        outer.display();
        System.out.println();

        // Create object of inner class
        // Syntax: Outer.Inner inner = outer.new Inner();
        Outer.Inner inner = outer.new Inner();
        // Call display method of inner class
        inner.display();
    }
}