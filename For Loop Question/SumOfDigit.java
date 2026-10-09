// This program calculates the sum of all digits of a number entered by the user.
// Example:
// Enter A Number : 1234
// Output: 10
// (Because 1 + 2 + 3 + 4 = 10)

import java.util.*;
public class SumOfDigit {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = Sc.nextInt();	
        int i = n;
        int sum = 0;

        for(; i != 0 ; i = i / 10){
            sum = sum + (i % 10);
        }

        System.out.println(sum);
    }
}