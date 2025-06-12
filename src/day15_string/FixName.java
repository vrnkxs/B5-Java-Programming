package day15_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String firstName = key.next();
        System.out.print("Please, enter your lastname: ");
        String lastName = key.next();

        System.out.println("----------------------------");
        System.out.println("Your Full Name (before fix: " + firstName +" "+ lastName);
        System.out.println("Changes: ");
        firstName = "" + firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        lastName = "" + lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        System.out.println("Result so far: " + firstName + " " + lastName);



    }
}
