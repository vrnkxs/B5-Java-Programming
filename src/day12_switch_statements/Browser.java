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
        //RULE2 -
        //RULE3 -
        //RULE4 -

        switch (browser) {
            case "Chrome":
                System.out.println("Opening " + webPage + " in Chrome");
            case "Safari":
                System.out.println("Opening " + webPage + " in Safari");
            case "Firefox":
                System.out.println("Opening " + webPage + " in Safari");
            case "Internet Explorer":
                System.out.println("Opening " + webPage + " in Internet Explorer");
                break;
            case "Opera":
                System.out.println("Opening " + webPage + " in Opera");
                break;
        }

    }
}
