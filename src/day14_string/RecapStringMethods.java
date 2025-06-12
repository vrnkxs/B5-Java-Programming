package day14_string;

public class RecapStringMethods {
    public static void main(String[] args) {
        //declared string reference =
        String str1 = "loop";  // by literals
        String str2 = "loop";  // by literals
        String str3 = new String("loop");  //by 'new' keyword
        String str4 = new String("loop");  //by 'new' keyword

        //comparing memory location with '=='
        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        System.out.println(str3 == str4); //false

        //"".equals(""); - compares the value (exact values)
        System.out.println( str1.equals(str2) ); //true
        System.out.println( str1.equals(str3) ); //true
        System.out.println( str3.equals(str4) ); //true
        System.out.println( "loop".equals(str3) ); //true
        System.out.println( str1.equals("loop") ); //true
        System.out.println( new String("loop").equals("loop") ); //true
        System.out.println( "loop".equals(new String("loop")) ); //true
        System.out.println( new String("loop").equals(new String("loop")) ); //true

        boolean resultOfEqualsMethod = str1.equals(str2);
        System.out.println(resultOfEqualsMethod);
        System.out.println();

        //"".equalsIgnoreCase(""); -> compares the value (characters without case sensitiveness)
        String str5 = "Loop";
        System.out.println(str1.equalsIgnoreCase(str5));
        boolean isSameWithoutCaseSensitiveness = "LoOp".equalsIgnoreCase(str5);
        System.out.println(isSameWithoutCaseSensitiveness);

        if(isSameWithoutCaseSensitiveness) {
            System.out.println("These two string values are the same without case sensitiveness");
        } else {
            System.out.println("These two string values are the same without case sensitiveness");
        }

        System.out.println();
        //"".length(); -> counts how many characters there are and returns int; use ONLY WITH STRING
        System.out.println( str1.length() ); //4
        str1 = str1 + "camp"; //we made a new String (String is immutable)
        System.out.println( str1.length() ); //8

        int num = 10;
        //System.out.println( (""+10).length() ); //2

        String str6 = "Loop";
        //write a code that checks if the word has even or odd number characters

        if (str6.length() % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
