// This program calculates the factorial of a given number entered by the user.
// Factorial of n (n!) is the product of all positive integers from 1 to n.
// Example:
// Enter A Number : 5
// Output: 120
// (Because 5! = 5 × 4 × 3 × 2 × 1 = 120)

import java.util.*;
public class FactorialFinder {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = Sc.nextInt();	
        int fact = 1;

        for(int i = 1 ; i <= n ; i++){
            fact = fact * i;
        }

        System.out.println(fact);
    }
}