package Conditional_Statment_AND_Pattern_17_Feb_2025;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number of rows:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}

//OUTPUT:
//Enter a Number of rows:5
//    *
//   **
//  ***
// ****
//*****

