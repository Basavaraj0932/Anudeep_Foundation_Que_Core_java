package IF_Else_1_Feb_2025;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter City Name:");
        String city = sc.next();
        System.out.println("Enter Sales:");
        double sales = sc.nextDouble();

        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                System.out.printf("Commission is: %.2f%n", (5 * sales) / 100);
            } else if (sales >= 500 && sales <= 1000) {
                System.out.printf("Commission is: %.2f%n", (7 * sales) / 100);
            } else if (sales >= 1000 && sales <= 10000) {
                System.out.printf("Commission is: %.2f%n", (8 * sales) / 100);
            } else {
                System.out.printf("Commission is: %.2f%n", (12 * sales) / 100);
            }
            
            
        } else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                System.out.printf("Commission is: %.2f%n", (4.5 * sales) / 100);
            } else if (sales >= 500 && sales <= 1000) {
                System.out.printf("Commission is: %.2f%n", (7.5 * sales) / 100);
            } else if (sales >= 1000 && sales <= 10000) {
                System.out.printf("Commission is: %.2f%n", (10 * sales) / 100);
            } else {
                System.out.printf("Commission is: %.2f%n", (13 * sales) / 100);
            }
            
            
        } else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                System.out.printf("Commission is: %.2f%n", (5.5 * sales) / 100);
            } else if (sales >= 500 && sales <= 1000) {
                System.out.printf("Commission is: %.2f%n", (8 * sales) / 100);
            } else if (sales >= 1000 && sales <= 10000) {
                System.out.printf("Commission is: %.2f%n", (12 * sales) / 100);
            } else {
                System.out.printf("Commission is: %.2f%n", (14.5 * sales) / 100);
            }
        } else {
            System.out.println("Enter valid city name");
        }

        sc.close();
    }
}
