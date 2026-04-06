package fin_res;

import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name_input = sc.nextLine();
        
        System.out.print("Age: "); 
        int age = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("City: ");
        String city_input = sc.nextLine();
        
        System.out.println("Your details are: ");
        System.out.println("Name: "+ name_input );
        System.out.println("Age: "+ age );
        System.out.println("City: "+ city_input ); 
        System.out.println("***Thank You***");
    }
}