import java.util.Scanner;

public class SwapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Swapping using third variable
        System.out.println("\n--- Swapping using third variable ---");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // Resetting values for second swap
        System.out.print("\nEnter first number (a): ");
        a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        b = sc.nextInt();

        // Swapping without third variable
        System.out.println("\n--- Swapping without third variable ---");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
