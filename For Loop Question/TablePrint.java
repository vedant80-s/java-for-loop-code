// This program prints the multiplication table of a given number up to 10,
// but stops early if the product exceeds 50.
// Example:
// Enter A Number : 7
// 7 X 1 = 7
// 7 X 2 = 14
// 7 X 3 = 21
// 7 X 4 = 28
// 7 X 5 = 35
// 7 X 6 = 42
// 7 X 7 = 49

import java.util.*;
public class TablePrint {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = Sc.nextInt();	

        for(int i = 1 ; i <= 10 ; i++){
            int multi = n * i;
            if(multi > 50){
                break;
            }
            System.out.println(n + " X " + i + " = " + multi);
        }
    }
}