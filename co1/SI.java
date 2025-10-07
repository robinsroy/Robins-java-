import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat(), r = sc.nextFloat(), t = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}
