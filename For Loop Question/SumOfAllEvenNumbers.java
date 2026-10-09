// This program calculates the sum of all even numbers from 1 to the number entered by the user.
// Example:
// Enter A Number : 10
// Output: 30
// (Even numbers: 2 + 4 + 6 + 8 + 10 = 30)

import java.util.*;
public class SumOfAllEvenNumbers {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = Sc.nextInt();
        int sum = 0;

        for(int i = 1 ; i <= n ; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}