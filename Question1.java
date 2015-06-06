// Mario Ibanez

import java.util.Scanner;

public class Question1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Question 1.");
        System.out.println("Please enter an integer:  ");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter a second integer:  ");
        int secondInt = scanner.nextInt();

        System.out.println("The maximum of the two integers is: " + maxOfTwo(firstInt, secondInt));
      }
    
    public static int maxOfTwo(int a, int b) {
        return  (a < b) ? b : a;
    }
    
  }