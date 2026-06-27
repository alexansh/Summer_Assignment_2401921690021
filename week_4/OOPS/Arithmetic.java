// Arithmetic.java
// Class implementing the test interface

public class Arithmetic implements test {
    // Implementing the square method from test interface
    @Override
    public void square(int num) {
        int result = num * num;
        System.out.println("Square of " + num + " is: " + result);
    }
}