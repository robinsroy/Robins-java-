import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int original = num;

        // Sum digits
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits of " + original + " is: " + sum);
    }
}
