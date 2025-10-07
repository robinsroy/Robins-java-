import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("First " + n + " terms of Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
