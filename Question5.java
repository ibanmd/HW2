// Mario Ibanez

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5 {
    public static void main(String args[]) {
        
        
                
        System.out.println("Welcome to Question 5.");
        System.out.println("Please enter a credit card number (long integer):  ");
        
        Scanner scanner = new Scanner(System.in);
        Long cardNumber = scanner.nextLong();
        //Long cardNumber = 4388576018410707;
        
        if (isValid(cardNumber)) {
            System.out.println("Thank you, that was a valid card number.");
        } else {
            System.out.println("Your card number was invalid.");
        }
        
    }
    
    public static Boolean isValid(long number) {
    
        String string = Long.toString(number);
        
        // Check length
        int length = string.length();
        if (!(length >= 13 && length <= 16)) {
            System.out.println("invalid length");
            return false;
        }
  
        // Check starting digits for different brands
        if (! (string.substring(0,1).equals("4") ||
               string.substring(0,1).equals("5") ||
               string.substring(0,2).equals("37") ||
               string.substring(0,1).equals("6"))) {
            System.out.println("invalid starting digits");
            return false;
        }
        
        // Check the 5 step algorithm
        int digit;
        long temp = number;
        List<Long> array = new ArrayList<Long>();
        do{
            array.add((temp % 10));
            temp /= 10;
        } while  (temp > 0);
        //System.out.println(array);
        
        long sumEven = 0;
        for (int i = 1; i < array.size(); i+=2) {
            sumEven += addDigits(2*(array.get(i)));
            //System.out.println("even loop index at:  " + (i) + " with value: " + array.get(i) + " and sum: " + sumEven);
        }
        
        long sumOdd = 0;
        for (int i = 0; i < array.size(); i+=2) {
            sumOdd += (array.get(i));
            //System.out.println("odd loop index at:  " + (i) + " with value: " + array.get(i) + " and sum: " + sumOdd);
        }
        
        if ((sumEven+sumOdd)%10 != 0) {
            System.out.println("You card failed the algorithm.");
            return false;
        }
        
        return true;
        
    }
    
    public static Long addDigits(Long number) {
        return number/10 + number%10;
    }
    
}

