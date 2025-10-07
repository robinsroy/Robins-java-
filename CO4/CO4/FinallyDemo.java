public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("Resource opened");

        try {
            int x = 10 / 0;  // deliberate exception
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        } finally {
            System.out.println("Resource closed");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
