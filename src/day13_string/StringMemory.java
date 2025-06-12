package day13_string;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {
        //declared object/non_primitive reference
        //className(dataType-Scanner) referenceName
        Scanner keyboard;

        //declared object/non_primitive reference
        //className(dataType-String) referenceName
        String word;

        //declared primitive reference
        //dataType-int   variable name(variable reference name
        int num;

        //---------------------------------------------------
        //there are 2 ways of creating string in java

        //option1 - by LITERALS -> simply created string by double quotation
        String str1 = "Java";

        //option2 - by 'new keyword'     ONLY WITH STRING!!!
        String str2 = new String("Java"); //with this, it will create a new object in the heap

        String str3 = "Java"; //with this, it will just point out a different string to the same object without creating a new one

        String str4 = new String("Java");  //no one creates it this way, but it exists
        //STACK = HEAP (there is a "string pool" inside of heap, which holds object created by literals

        String str5 = "Java";
        String str6 = "java";
        String str7 = "java";

        System.out.println(str1); //Java
        System.out.println(str2); //Java
        System.out.println();     //Java
        System.out.println(str4); //Java
        System.out.println("-------------");
        System.out.println(str1 == str2); //false (with == we are comparing the memory location of the String values)
        System.out.println(str2 == str3); //false
        System.out.println(str1 == str3); //true
        System.out.println(str2 == str4); //false

        // ==  -> DO NOT EVER USE relational equation operator to COMPARE String values; == compares the memory location, not the value

    }
}
