package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("What day is today: ");
        String day = key.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = key.next();

        System.out.print("Enter your last name: ");
        String lastName = key.next();

        key.nextLine();   //this will handle the ENTER button

        System.out.print("Please enter your address: ");
        String address = key.nextLine();  //nextLine is taking multiple things as an input (including space, characters, and even enter)

        // RULE with nextLine() -> if there is any other Scanner methods (other than nextLine() method), we have to hand ENTER
        //to hand it: we use an extra nextLine();

        System.out.print("Please enter your job title: ");
        String jobTitle = key.nextLine();

        System.out.print("Please, enter your team members names: ");
        String teamMembers = key.nextLine();

        System.out.print("How many team members you have in your team: ");
        int numOfTeamMembers = key.nextInt();

        key.nextLine();  //handle Enter
        System.out.print("What are the holidays you have: ");
        String holidays = key.nextLine();
    }
}
