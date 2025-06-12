package day13_string;

public class StringMethods {
    public static void main(String[] args) {

        String name1 = "Tom"; //by literals - in String Pool inside Heap
        String name2 = "Tom"; //by literals - in String Pool inside Heap
        String name3 = new String("Tom"); //by new keyword - directly in Heap

        //== -> this will compare MEMORY LOCATION
        System.out.println(name1 == name2); //True
        System.out.println(name1 == name3); //False
        System.out.println(name2 == name3); //False
        System.out.println("------------------------");

        // #1 - .equals(); this will compare String Value (including the case sensitiveness)
        System.out.println( name1.equals(name2) ); //True
        System.out.println( name1.equals(name3) ); //True
        System.out.println( name2.equals(name3) ); //True

        System.out.println( "Tom".equals(name3) ); //True
        System.out.println( name3.equals("Tom") ); //True

        String name4 = new String("TOM");
        System.out.println( name1.equals(name4) ); //false -> baecause "Tom" - "TOM"

        System.out.println( new String("TOM").equals(name4) ); //"TOM" - "TOM"

        boolean isN1SameAsN3 = name1.equals(name3);
        System.out.println(isN1SameAsN3);

        System.out.println("-----------------");
        //Q: How can we compare by IGNORING the CASE SENSITIVENESS
        // #2 - .equalsIgnoreCase(); this will compare String Value (excluding the case sensitiveness(same letters, doesnt matter Uppercase or Lowercase)

        String str1 = "Wed";
        String str2 = "WED";

        System.out.println( str1.equals(str2)); //fasle
        System.out.println( str1.equalsIgnoreCase(str2)); //true (because contains of the same letters)

        System.out.println("-----------------");
        //Q: How can I get how many characters we have in the String
        //#3 -  .length(); this will give us a total of the characters
        String sentence = "I love java"; //11 characters
        System.out.println( sentence.length() );

        sentence = "Loopcamp has SDET program. It lasts for 6 months.";
        System.out.println( sentence.length() );

        int numOfCharactersInSentence = sentence.length();
        System.out.println(numOfCharactersInSentence);


    }
}
