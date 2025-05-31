package day09_a_scanner;

import java.util.Scanner;

/*
    create Scanner object
    ask the user to enter 3 numbers
    find and print the sum of the numbers

    later divide your total into 2

    Hey now use the divided version and add 2
 */
public class AddNumbers {
    public static void main(String[] args) {

        //created scanner object and assigned it into keyboard object reference
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Please enter 3 numbers: ");
        System.out.print("\tNumber1: ");
        int num1 = keyboard.nextInt();   //getting info from user

        // !!System.out.println(keyboard.nextInt()); -> asking a user to type in smth, + printing it out => so we will see it twice in the oputput

        System.out.print("\tNumber2: ");
        int num2 = keyboard.nextInt();

        System.out.print("\tNumber3: ");
        int num3 = keyboard.nextInt();

        int sumOfAll = num1 + num2 + num3;
        System.out.println("Sum of numbers: " + sumOfAll);

        int halfOfTotal = sumOfAll / 2;
        System.out.println("Half of the total: " + halfOfTotal);

        //int afterAdd2 = halfOfTotal;
        //afterAdd2 += 2;
        System.out.println("After adding 2: " + (halfOfTotal + 2));
    }
}
