import java.util.Scanner;

public class MaxOfThreeIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        // Finding maximum using if-else
        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Maximum of the three numbers is: " + max);
    }
}
