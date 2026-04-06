package fin_res;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num_1 = sc.nextInt();
        
        System.out.print("Enter number 2: ");
        int num_2 = sc.nextInt();
        
        System.out.println("Enter Your choice!");
        System.out.println("1.Add");
        System.out.println("2.Subraction");
        System.out.println("3.Mulitplication");
        System.out.println("4.Division");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Result: " + (num_1 + num_2));
                break;

            case 2:
                System.out.println("Result: " + (num_1 - num_2));
                break;

            case 3:
                System.out.println("Result: " + (num_1 * num_2));
                break;

            case 4:
                if (num_2 != 0) {
                    System.out.println("Result: " + (num_1 / num_2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}