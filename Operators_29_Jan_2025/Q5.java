package Operators_29_Jan_2025;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		float l= sc.nextInt();
		System.out.println("Enter Breadth:");
		float b= sc.nextInt();
		
	    float Area = l * b;
	    System.out.println("Area of Reactangle is :"+Area);
	    
	    float Perimeter = 2 * (l+b);
	    System.out.println("Perimeter Of Recatngle is:" + Perimeter);
	    
	}

}
