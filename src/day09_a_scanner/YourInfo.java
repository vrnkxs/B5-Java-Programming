package day09_a_scanner;

import java.util.Scanner;

/*
    Ask them to enter their favorite book
    Ask the user to enter their age (byte),
    and ask them to enter their favorite number (long),

    Print all the values from the inputs

 */
public class YourInfo {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please enter your favourite book: ");
        String book = key.nextLine();   //can take multiple words

        System.out.print("Please enter your age: ");
        byte age = key.nextByte();

        System.out.print("Please enter your favourite number: ");
        long favNum = key.nextLong();

        System.out.println("\nInfo you entered: ");
        System.out.println("\t" + book);
        System.out.println("\t" + age);
        System.out.println("\t" + favNum);
    }
}
