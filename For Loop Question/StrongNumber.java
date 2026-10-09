// This program calculates the sum of factorials of each digit of a number.
// If the sum equals the original number, it's called a Strong Number.
// Example:
// Enter A Number : 145
// Output: Factorial Sum : 145
// (Because 1! + 4! + 5! = 1 + 24 + 120 = 145 → Strong Number)
import java.util.*;
public class StrongNumber {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
	System.out.println("Enter A Number : ");
        int n = Sc.nextInt();	
	int i  = n ;
	int sum = 0 ;
	int factSum = 0;
       for(; i != 0 ;i = i/10){
		sum = i % 10;
	int fact = 1 ; 
	for(int j = 1 ; j <= sum ; j++){
		fact = fact *j ;
		
        }factSum = factSum + fact ;
	
        }System.out.println("Factorial Sum : " + factSum);
    }
}



