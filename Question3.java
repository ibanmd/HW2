// Mario Ibanez

import java.util.Scanner;

public class Question3 {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Welcome to Question 3.");
        System.out.println("Please enter an integer:  ");
        int inputNumber = scanner.nextInt();
        System.out.println("Thank you! \nCalculating....\n");
        
        if (isPalindrome(inputNumber)) {
            System.out.println("The number " + inputNumber + " is a palindrome.");
        } else {
            System.out.println("The number " + inputNumber + " is a NOT palindrome.");
        }
    
    }
    
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number) {
        int reverse = 0;
        int onesDigit = 0;
        for (int i = 1; number > 0; i++) {
            onesDigit = number % 10;
            reverse = (reverse * 10) + onesDigit;
            number = number / 10;
        }
        return reverse;
    }
        
    //Return true if number is a palindrome
    public static Boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    
}
    