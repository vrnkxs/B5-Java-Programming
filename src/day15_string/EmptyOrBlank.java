package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "mew method";

        //#10 -"".isEmpty(); -checks if String is empty and returns boolean. -> "";
        System.out.println( str.isEmpty() ); //it has some characters, so NOT empty
        System.out.println( str.length() ==0 ); //false

        System.out.println();
        str = "";
        System.out.println( str.isEmpty() );
        System.out.println( str.length() );
        System.out.println( str.length() ==0 ); //true

        System.out.println("--------------");

        str = " ";
        System.out.println( str.isEmpty() ); //false
        System.out.println( str.length() ); //1

        //#11 - "".isBlank(); -checks if String has ONLY EMPTY(blank) SPACES and return boolean-> "   ";  /   "";
        System.out.println( str.isBlank() ); //it checks if String is only made out of " " - spaces

        str = "     ";
        System.out.println( str.isBlank() );

        System.out.println("--------------");
        str = " java softskills";
        System.out.println( str.isEmpty() ); //false
        System.out.println( str.isBlank() ); //false
    }
}
