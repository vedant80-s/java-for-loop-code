// This program checks whether a given number is prime or not.
// A prime number is only divisible by 1 and itself.
// Example:
// Enter A Number : 7
// Output: This Number Is Prime

import java.util.*;
public class PrimeNumberFinder {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = Sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("This Number Is Prime");
        } else {
            System.out.println("This Number Is Not Prime");
        }
    }
}