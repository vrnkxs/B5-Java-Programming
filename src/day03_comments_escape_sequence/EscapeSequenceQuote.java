package day03_comments_escape_sequence;

import java.sql.SQLOutput;

public class EscapeSequenceQuote {

    public static void main(String[] args) {
        /*
            Q: To be able to print we need double quotes. How do we print double quotes itself?
                 Ex: Programming language "Java" is a great one.
            A: We can use ESCAPE SEQUENCE sequence. ---- > \
                 \ --- > back slash
                 / --- > forward slash
         */
        System.out.println("Programming language Java is a great one");
        System.out.println("Programming language \"Java\" is a great one");

        /*
            Q: Since we use BACKWARD SLASH for double quotes, how do we print the BACKWARD SLASH itself?
                 Ex: Today is 05]10\2025
         */
        System.out.println("Today is 05 10 2025");
        System.out.println("Today is 05/10/2025");
        System.out.println("Today is 05\\10\\2025");
        System.out.println("Today is 05\10\\2025"); // 5\10 is LOST (some data is lost).

        // How about if I want to print double backward slash?
        System.out.println("Today is 05\'10\'2025"); // Here backward slash is redundant (but still works), so we can remove it.
        System.out.println("Today is 05'10'2025");

    }
}
