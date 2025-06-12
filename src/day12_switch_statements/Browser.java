package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please, enter your browser name: ");
        String browser = keyboard.nextLine();

        System.out.print("Which webpage (URL) you want to navigate to: ");
        String webPage = keyboard.next();

        //opening webPage in browser

        //RULE1 - the exactValues/cases canNOT be duplicate
        //RULE2 - For switch we canNOT compare with relational operators (>, <, <=, >=, [==], !=)
        //RULE3 - ONLY String, char, int, short, byte
        //RULE4 - After 1st matching case Execution goes until the 1st break reached

        switch (browser) {
            case "Chrome":
                System.out.println("Opening " + webPage + " in Chrome");
                //break
            case "Safari":
                System.out.println("Opening " + webPage + " in Safari");
                //break
            case "Firefox":
                System.out.println("Opening " + webPage + " in Safari");
                //break
            case "Internet Explorer":
                System.out.println("Opening " + webPage + " in Internet Explorer");
                break;
            case "Opera":
                System.out.println("Opening " + webPage + " in Opera");
                break;
        }

    }
}
