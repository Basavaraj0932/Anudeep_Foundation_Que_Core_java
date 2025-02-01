package Operators_29_Jan_2025;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Num1:");
		int num1 = sc.nextInt();
		System.out.println("Num2:");
		int num2 = sc.nextInt();
		System.out.println("Num3:");
		int num3 = sc.nextInt();
		
		
		//Arithmatic operators
		
		 int add  = num1 + num2;
		 System.out.println("Addtion is:"+add);
		 int sub  = num1 - num2;
		 System.out.println("Substraction is:"+sub);
		 int  mul  = num1 * num2;
		 System.out.println("Multiplication is:"+mul);
		 int div  = num1 / num2;
		 System.out.println("Division is:"+div);
		 int mod  = num1 % num2;
		 System.out.println("Modulo is:"+mod);
		 
		 
		 //Logical Operator
		 
		 System.out.println("Enter val1:");
		 boolean val1  = sc.nextBoolean();
		 System.out.println("Enter val2:");
		 boolean val2  = sc.nextBoolean();
		 
		System.out.println("The value of AND Operator is:" + (val1 && val2));
		System.out.println("The value of OR Operator is:" + (val1 || val2));
		System.out.println("The value of NOT Operator is:" + !(val2));
		 
		 
		//Assignment Operator
		System.out.println();
        System.out.println("Assign ment opertaor value is");
        if(num1 >=num2  && num1>=num3 ) {
        	System.out.println("num1 is greater");	
        }else if(num2>=num3 && num2<num1){
        	System.out.println("Num2 is smaller than num1");
        }else {
        	System.out.println("num3 is smaller");
        }
        System.out.println();
        
      //ternary  oerator 
        
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum is = " + max);
        
        
      //Bitwise Operator
        
        
        
	}
	
	

	

}
