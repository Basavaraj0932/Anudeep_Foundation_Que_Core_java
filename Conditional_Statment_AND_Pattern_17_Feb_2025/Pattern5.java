package Conditional_Statment_AND_Pattern_17_Feb_2025;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of rows:");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=n; k>=i; k--) {
                if(i % 2 == 0) {
                    if(k % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    if(k % 2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}

//OUTPUT:
//Enter a Number of rows:5
//		10101
//		 0101
//		  101
//		   01
//		    1
//
