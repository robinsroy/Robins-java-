class FibonacciExplorer {
    // Static variable to count recursive calls
    static int callCount = 0;

    // Recursive Fibonacci method
    static int fibonacci(int n) {
        callCount++; // Increment counter on every call

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 8;  // Change this value to get more Fibonacci numbers

        System.out.println("First " + n + " Fibonacci Numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n\nTotal recursive calls made: " + callCount);
    }
}
