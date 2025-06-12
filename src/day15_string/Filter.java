package day15_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter a message");
        String userMessage = key.nextLine();

        System.out.println("--------------------------------");
        System.out.println("Original message: " + userMessage);

        String changedMessage = userMessage.trim(); //assigned to another variable, because we still need to use the original message
        System.out.println("Trimmed message: " + userMessage);

        changedMessage = changedMessage.toLowerCase();
        System.out.println("Lower cased message: " + changedMessage);

        System.out.println("------------------------------------------------");
        //"".contains(""); -> since it is NOT ignoring case sensitiveness, we need to bring everything either in LOWER CASE or in UPPER CASE to check if it actually contains since it checks for EXACT value
        boolean hasBadPhrases = changedMessage.contains("lava is bad") ||
                                changedMessage.contains("quit") ||
                                changedMessage.contains("have fun") ||
                                changedMessage.contains("lava is bad");

        //hasBadPhrases = hasBadPhrases.toLowerCase(); //invalid, because it is boolean

        if( hasBadPhrases) {
            System.out.println("Message failed to send");
        } else {
            System.out.println("\"" + userMessage + "\" was sent!");
        }

    }
}
