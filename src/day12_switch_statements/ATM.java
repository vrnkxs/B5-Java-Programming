package day12_switch_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int correctPin = 2222;
        double balance = 100_000.00;

        System.out.print("Welcome to ATM\n\tPlease, insert your card. \n\tPlease, enter your pin: ");
        int userInputVar = keyboard.nextInt();

        //check if the pin is 4 digits
        //4 digits -> 1000.....9999
        if(userInputVar < 1000 || userInputVar > 9999) {
            System.out.println("You have entered either less than or more than 4 digits");
        } else {

            if (userInputVar == correctPin) {

                System.out.println("\n\tYou are logged in!");
                System.out.println("\t\tSelect one of the options below:");
                System.out.println("\t\t\t1-Check balance");
                System.out.println("\t\t\t2-Deposit money");
                System.out.println("\t\t\t3-Withdraw money");
                System.out.println("\t\t\t4-Exit");
                System.out.println("\t\t\tChoose between 1-4: ");
                int userChoice = keyboard.nextByte();

                //if (!(userChoice >= 1 && userChoice <= 4)) {

            } else {
                System.out.println("\n\tWrong pin!");
            }

        }


    }
}
