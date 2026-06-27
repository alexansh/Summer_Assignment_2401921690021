// ToTestInt.java
// Class that uses an object of Arithmetic class

public class ToTestInt {
    public static void main(String[] args) {
        // Create an object of Arithmetic class
        Arithmetic obj = new Arithmetic();

        // Use the object to call the square method
        obj.square(5);
        obj.square(12);

        // Demonstrate that we can also create multiple objects
        Arithmetic another = new Arithmetic();
        another.square(7);
    }
}