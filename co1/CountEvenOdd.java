import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
