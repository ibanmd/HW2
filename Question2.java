// Mario Ibanez

import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
    
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Welcome to Question 2.");
        System.out.println("Please enter an integer greater than 2:  ");
        int integer = scanner.nextInt();
        System.out.println("You chose:  " + integer);
        
        if (integer >= 2) {
            System.out.println("Time to begin looping and add up the even numbers! \n");
            for (int i = 1; i <= integer/2; i++) {
                sum += 2*i;
                System.out.println("Current even number is: " + 2*i);
                System.out.println("Current total sum is:   " + sum + "\n");
            }
            int upperLimit = ((integer%2==0) ? integer : integer - 1);
            System.out.println("The sum of the even numbers between 2 and " + upperLimit + " inclusive is: " + sum);
            
        } else {
            System.out.println("Your integer was too small, please try again.");
        }
    
    
    }

}