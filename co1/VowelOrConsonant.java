import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter an alphabet character: ");
        char ch = sc.next().toLowerCase().charAt(0); // convert to lowercase for easy check

        // Check if it's an alphabet
        if ((ch >= 'a' && ch <= 'z')) {
            // Vowel check
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
    }
}
