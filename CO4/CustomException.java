import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        try {
            double result = computeSquareRoot(num);
            System.out.println("Square root is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    // Method to compute square root with validation
    public static double computeSquareRoot(double n) {
        if (n < 0) {
            throw new ArithmeticException("Cannot compute square root of a negative number!");
        }
        return Math.sqrt(n);
    }
}
