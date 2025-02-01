package Loop_31_jan_2025;

import java.util.Scanner;

public class for_loop_Min_max_value {

	public static void main(String[] args) {

		int min,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Min number:");
		min = sc.nextInt();	
		
		System.out.println("Enter Max number:");
		max = sc.nextInt();	
		
		System.out.println("Loop is :");
		
		for( int i=min; i<=max;i++) {
			System.out.println(i);
			
		}
	}

}
