package Operators_29_Jan_2025;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Priciple:");
		float P = sc.nextInt();
		System.out.println("Rate of Intrest:");
		float R = sc.nextInt();
		System.out.println("No Of Years:");
		float N = sc.nextInt();
		
		
		float SI = (P * R * N)/100;
		System.out.println("Simple Intrest is:"+SI);
	}

}
