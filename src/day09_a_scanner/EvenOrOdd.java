package day09_a_scanner;

import java.util.Scanner;

/*
    Ask the user to enter an int number.
        Determine if the number is even or odd
        Print a boolean for both even and odd
 */
public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);

        System.out.print("Please enter a number: ");
        int number = keyboard.nextInt();

        boolean isEven = number % 2 == 0;  //true -> even
        boolean isOdd = number % 2 != 0;  //true -> odd
        // OR boolean isOdd = number % 2 == 1;
        // OR boolean isOdd = !isEven;

        System.out.println(number + " is even: " + isEven);
        System.out.println(number + " is odd: " + isOdd);
    }
}
