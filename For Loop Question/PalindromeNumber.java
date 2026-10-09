// This program checks whether a given number is a palindrome or not.
// A palindrome number reads the same forward and backward (e.g., 121, 1331).
// Example:
// Enter number: 121
// Output: Palindrome
// Enter number: 123
// Output: Not Palindrome

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int rev = 0, temp = n;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;  // Extract last digit and build reverse
            temp /= 10;                  // Remove last digit
        }

        if (rev == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}