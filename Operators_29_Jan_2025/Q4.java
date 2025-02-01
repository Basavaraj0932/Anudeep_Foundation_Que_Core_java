package Operators_29_Jan_2025;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius:");
		float r= sc.nextInt();
		
		
	    double Area  =   Math.PI * r * r;
		System.out.println("Area of Circle is: " + Area);
		
		double Circum= 2 * Math.PI * r;
		System.out.println("Circumference of Circle is: " + Circum);
		
	}

}
