package IF_Else_1_Feb_2025;

import java.util.Scanner;

public class Q1_1 {

	public static void main(String[] args) {
				
			//Fruits Shop
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Fruit");
		String NameOfFruit = sc.nextLine();
		System.out.println("Enter Name of Day");
		String NameOfDay = sc.nextLine();
		System.out.println("Enter number of kg:");
		float kg  = sc.nextFloat();
		
		if(NameOfDay.equals("monday") || NameOfDay.equals("tuesday")||NameOfDay.equals("wednesday") || NameOfDay.equals("thursday") ||  NameOfDay.equals("friday")) {
		    
		    	switch(NameOfFruit) {
		    	case "banana" : 
		    		System.out.println("Price is :" + 2.50* kg);
		    		break;
		    	case "apple" : 
		    		System.out.println("Price is : " +1.20*kg);
		    		break;
		    	case "orange" : 
		    		System.out.println("Price is : " + 0.85 *kg);
		    		break;
		    	case "grapeFruit" : 
		    		System.out.println("Price is : " + 1.45*kg);
		    		break;
		    	case "kiwi" : 
		    		System.out.println("Price is : " +2.70 *kg);
		    		break;
		    	case "pineapple" : 
		    		System.out.println("Price is : " + 5.50 *kg);
		    		break;
		    	case "grapes" : 
		    		System.out.println("Price is : " + 3.85 *kg);
		        default:
                    System.out.println("Fruit not found or price not listed."); 
                    break;
            }
        } else {
            System.out.println("error");
        }
     
       
     
		
		if(NameOfDay.equals("sunday") || NameOfDay.equals("saturday") ) {
		    
		    	switch(NameOfFruit) {
		    	case "banana" : 
		    		System.out.println("Price is : " +2.70 * kg ) ;
		    		break;
		    	case "apple" : 
		    		System.out.println("Price is : " +1.25 * kg );
		    		break;
		    	case "orange" : 
		    		System.out.println("Price is : " +0.90 * kg );
		    		break;
		    	case "grapeFruit" : 
		    		System.out.println("Price is : " + 1.60 * kg );
		    		break;
		    	case "kiwi" : 
		    		System.out.println("Price is : " +3 * kg );
		    		break;
		    	case "pineapple" : 
		    		System.out.println("Price is : " + 5.60 * kg );
		    		break;
		    	case "grapes" : 
		    		System.out.println("Price is : " +4.20* kg );
		    		break;
		        default:
                    System.out.println("Fruit not found or price not listed."); 
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}
		
		

	


