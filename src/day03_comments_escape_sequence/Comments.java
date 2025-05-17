package day03_comments_escape_sequence;

public class Comments {

    public static void main (String[] args) {
        //SINGLE LINE COMMENT
        //The following println statement prints Loopcamp
        System.out.println("Loopcamp");
        //System.out.println("Java"); //Commented out this line. So it is not executable.
        System.out.println();
        //TODO i will check this single line comment later
        //---------------------------------------------------------------------------------------------------

        /*
            MULTI-LINE COMMENT

            This is multi-line comment
            We can press enter and have multiple lines comment out.
            Today is Saturday
            TODO: this is multi-line comment
         */

        System.out.println("Java");
        System.out.println("Day 03");
        System.out.println();
        //---------------------------------------------------------------------------------------------------

        /**
         *The following println is giving information about the current batch
         * Hello from Java
         * TODO: complete the Java Doc comment
         */

        System.out.println("This is Batch #5");
        System.out.println("Java class hours:");
        System.out.println("Wed: 7-10pm");
        System.out.println("Thu: 7-10pm");
        System.out.println("Sat: 9.30am-3pm");

    }


}
