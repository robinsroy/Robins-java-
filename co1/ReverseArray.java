import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print in reverse
        System.out.println("Array in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
