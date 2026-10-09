// This program prints the Fibonacci series up to 'n' terms entered by the user.
// The Fibonacci series starts with 0 and 1, and each next term is the sum of the previous two.
// Example:
// Enter a number: 7
// Output: Fibonacci Series: 0 1 1 2 3 5 8

import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int n = sc.nextInt();

        int a = 0, b = 1; 
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b; 
            a = b;        
            b = c;         
        }
    }
}