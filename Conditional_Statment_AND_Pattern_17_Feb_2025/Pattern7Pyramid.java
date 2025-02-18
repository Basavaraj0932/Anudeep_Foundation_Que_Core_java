package Conditional_Statment_AND_Pattern_17_Feb_2025;

import java.util.Scanner;

public class Pattern7Pyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

//OUTPUT:
//Enter the number of rows: 5
//    *
//   ***
//  *****
// *******
//*********
//
