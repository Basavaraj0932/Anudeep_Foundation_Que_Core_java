package IF_Else_1_Feb_2025;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an animal: ");
        String Animal = sc.next();

        if (Animal.equals("dog")) {
            System.out.println("This is a mammal");
        } else if (Animal.equals("crocodile") || Animal.equals("snake") || Animal.equals("tortoise")) {
            System.out.println("This is a reptile");
        } else {
            System.out.println("Unknown");
        }

        sc.close();
    }

}
