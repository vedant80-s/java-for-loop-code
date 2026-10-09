// This program counts how many numbers are positive, negative, or zero from a list entered by the user.
// Example:
// Enter a number: 5
// Enter a number 1 : 10
// Enter a number 2 : -3
// Enter a number 3 : 0
// Enter a number 4 : 7
// Enter a number 5 : -1
// Positive : 2
// Negative : 2
// Zero     : 1

import java.util.*;
public class PositiveNegativeZeroNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to check: "); 
        int n = sc.nextInt();

        int p = 0;   // count of positive numbers
        int ne = 0;  // count of negative numbers
        int Z = 0;   // count of zeros

        for(int i = 1 ; i <= n ; i++){
            System.out.print("Enter number " + i + " : ");
            int ns = sc.nextInt();

            if(ns > 0){
                p++;
            } else if(ns < 0){
                ne++;
            } else {
                Z++;
            }
        }

        System.out.println("Positive : " + p);
        System.out.println("Negative : " + ne);
        System.out.println("Zero     : " + Z);
    }
}