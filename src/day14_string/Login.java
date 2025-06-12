package day14_string;

import java.util.Scanner;
/*
    Ask the user to enter a username


    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password
 */
public class Login {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String validUsername = "loopcamp";
        String validPassword = "Loop Batch#5";

        System.out.print("Please, enter your username: ");
        String inputUsername = keyboard.next();

        keyboard.nextLine(); //handling the enter

        System.out.print("Please, enter your password: ");
        String inputPassword = keyboard.nextLine();

        if(validUsername.equalsIgnoreCase(inputUsername) && validPassword.equals(inputPassword)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect input");

            if (!validUsername.equalsIgnoreCase(inputUsername)) {
                System.out.println("Username is not correct");
            }
            if (!validPassword.equals(inputPassword)) {
                System.out.println("Password is not correct");

                //check if the password is 8 char long
                if (inputPassword.length() < 8) {
                    System.out.println("Your password input should not be less than 8 characters");
                }

            }

        }


    }
}
