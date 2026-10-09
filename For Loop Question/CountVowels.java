// This program counts the number of vowels in a string entered by the user.
// It checks each character and increments the count if it's a vowel (a, e, i, o, u).
// Example:
// Enter a string: Hello World
// Output: Number of vowels: 3
// (Vowels: e, o, o)
import java.util.Scanner;

public class CountVowels{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase(); 
        int vowelCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        scanner.close();
    }
}
