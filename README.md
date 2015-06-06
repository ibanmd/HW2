# HW2
hw 2 for cs 2

COP 3503
Computer Science II
Assignment 2
Summer 2015


1. Write a method called maxOfTwo that accepts two integer parameters and returns the
larger of the two. (5 pts.)


2. Design and implement an application that reads an integer value and prints the sum of all
even integers between 2 and the input value, inclusive. Print an error message if the input
value is less than 2. Prompt accordingly. (10 pts.)


3. (Palindrome integer) Write the methods with the following headers (10 pts)
```java
// Return the reversal of an integer, i.e., reverse(456) returns 654
Public static int reverse(int number)
//Return true if number is a palindrome
public static Boolean isPalindrome(int number)
```
Use the reverse method to implement isPalindrome. A number is a palindrome if its
reversal is the same as itself. Write a test program that prompts the user to enter an integer
and reports whether the integer is a palindrome.


4. (Check password) Some websites impose certain rules for passwords. Write a method that
checks whether a string is a valid password. Suppose the password rules are as follows.
A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid Password if
the rules are followed or Invalid Password otherwise. (10 pts)


5. Credit card numbers follow certain patterns. A credit card number must have between 13
and 16 digits. It must start with: (15 pts)
4 for Visa cards
5 for Master cards
37 for American Express cards
6 for Discover cards
In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The
algorithm is useful to determine if a card number is entered correctly or if a credit card is
scanned correctly by a scanner. Almost all credit card numbers are generated following this
validity check, commonly known as the Luhn check or the Mod 10 check, which can be
described as follows (for illustration, consider the card number 4388576018402626):
+ Double every second digit from right to left. If doubling of a digit results in a two-digit
number, add up the two digits to get a single-digit number.
2 * 2 = 4
2 * 2 = 4
4 * 2 = 8
1 * 2 = 2
6 * 2 = 12 (1 + 2 = 3)
5 * 2 = 10 (1 + 0 = 1)
8 * 2 = 16 (1 + 6 = 7)
4 * 2 = 8
a) Now add all single-digit numbers from Step 1.
4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
b) Add all digits in the odd places from right to left in the card number.
 6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
c) Sum the results from Step 2 and Step 3.
37 + 38 = 75
d) If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is
invalid. For example, the number 4388576018402626 is invalid, but the number
4388576018410707 is valid.
Write a program that prompts the user to enter a credit card number as a long integer.
Display whether the number is valid or invalid. Design your program to use the following
methods:
```java
/** Return true if the card number is valid */
public static Boolean isValid(long number)
/**Get the result from Step 2 */
public static int sumOfDoubleEvenPlace(long number)
/**Return this number if it is a single digit, otherwise, return the sum of the two digits */
public static int getDigit(int number)
/**Return sum of odd-place digits in number */
public static int sumOfoddPlace(long number)
/** Return true if the digit d is prefix for number */
public static Boolean prefixMatched(long number, int d)
/**Return the number of digits in d*/
public static in getSize(long d)
/** Return the first k number of digits from number. If the number of digits in number is
less thatn k, return number. */
public static long getPrefix(long number, int k)
```
Here are sample runs of the program:
Sample 1:
Enter a credit card number as a long integer: 4246345689049834
4246345689049834 is invalid
Sample 2:
Enter a credit card number as a long integer: 4388576018410707
4388576018410707 is valid
