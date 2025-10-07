import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        // Finding maximum using nested ternary operators
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Maximum of the three numbers is: " + max);
    }
}
