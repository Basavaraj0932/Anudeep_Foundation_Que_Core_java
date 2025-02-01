package Loop_31_jan_2025;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice:");
		int choice  = sc.nextInt();
		
		
		switch(choice) {
		case 1:
			int min,max;
			System.out.println("Enter Min number:");
			min = sc.nextInt();	
			
			System.out.println("Enter Max number:");
			max = sc.nextInt();	
			
			for(int i=min; i<=max;i++) {
				if(i % 2 == 0) {
					System.out.print(i);
				}else {
					System.out.println("Error");
				}
			}
			
			
		case 2:
			System.out.println("Enter  number:");
			int num = sc.nextInt();	
			
			boolean isPrime = true;
			if(num < 1 ) {
				System.out.println("It is not Prime Number");
			}else {
				for(int i=2;i<=Math.sqrt(num);i++) {
					if(num % i == 0) {
						isPrime = false;
						break;	
					}
			    }
			
			}
		if(isPrime) {
				System.out.println("It si Prime number");{
				}
		}
				
		else {
					System.out.print("It is Not Prime");
			}
		break;
			
		case 3:
		    System.out.println("Enter input to check if it's a palindrome:");
		    int input = sc.nextInt();
		    int original = input;
		    int reverse = 0;
		    
		    while(input != 0 ) {
		    	int lastDigit = input % 10 ; // find last digit
		    	reverse = reverse * 10 + lastDigit; // add last digit in that reverse varible
		    	input /= 10; ///take new input shift towards left
		    }
		    	if(original == reverse) {
		    		System.out.println("This is Palindrome");
		    	}else {
		    		System.out.println("This is NOT Palindrome");
		    	}
		    	break;
		    	
		case 4:
		    System.out.println("Take User input and check Armstrong:");
		    int num1 = sc.nextInt();
		    int originalNum = num1;
		    double sum = 0;
		    int length = String.valueOf(num1).length();
		    
		    while(num1 > 0) {
		        int lastDigit = num1 % 10;
		        sum += Math.pow(lastDigit, length);
		        num1 /= 10; // Update num1 to remove the last digit
		    }
		    
		    if(sum == originalNum) {
		        System.out.println(originalNum + " is an Armstrong Number");
		    } else {
		        System.out.println(originalNum + " is not an Armstrong Number");
		    }
		    break;

		    default:
		    	System.out.println("Invalid Input ");
		    }
          }
		
	}



