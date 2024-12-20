package app.nyangweso.test;

/**
 * @author Rodgers
 * <p>
 * Date: 25/10/2024
 * Time: 12:52 PM
 * <p>
 */
public class SimpleMethodExample {

    // Method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Calling the method and storing the result
        int result = addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}