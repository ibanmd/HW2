// Mario Ibanez

import java.util.Scanner;

public class Question4 {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Welcome to Question 4.");
        System.out.println("Please enter a password:  ");
        
        String inputPassword = scanner.nextLine();
        
        if (isValid(inputPassword)) {
            System.out.println("Thank you, that was a valid password.");
        } else {
            System.out.println("Your password was invalid.");
        }
        
        
        
    }
    
    public static Boolean isValid(String password) {
    
        String validCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        // Check digits and letters
        for (char character : password.toCharArray()) {
            if (!validCharacters.contains(Character.toString(character))) {
                return false;
            }
        }
        
        // Check length
        if (password.length() < 8) {
            return false;
        }
        
        // Checks for 2 numbers or more
        int digitCounter = 0;
        for (char character : password.toCharArray()) {
            if ("0123456789".contains(Character.toString(character))) {
                digitCounter++;
            }    
        }
        if (digitCounter < 2) {
            return false;
        }  
    
        return true;
    }
}
           