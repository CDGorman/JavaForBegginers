
package userinput;

import java.util.Scanner;

public class UserInput {    
    
    public static void main(String[] args) {        
        System.out.println("What is your first name?");
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        System.out.println("What is your last name?");
        String second = sc.nextLine();
        System.out.println("What is your predicted grade?");
        String grade = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextLine();
        System.out.println("First Name: " + first);
        System.out.println("Second Name: " + second);
        System.out.println("Predicted Grade: " + grade);
        System.out.println("Age: " + age);

    }
    
}
