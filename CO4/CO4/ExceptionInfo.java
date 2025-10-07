public class ExceptionInfo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception type: " + e.getClass().getName());
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
