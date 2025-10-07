import java.util.Scanner;

public class NumberTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check number type
        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
