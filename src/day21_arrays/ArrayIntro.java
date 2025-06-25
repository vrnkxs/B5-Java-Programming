package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String str1 = "Virginia";
        //             01234567
        char letter1 = str1.charAt(0);
        char letter2 = str1.charAt(1);
        char letter3 = str1.charAt(2);
        char letter4 = str1.charAt(3);
        char letter5 = str1.charAt(4);
        char letter6 = str1.charAt(5);
        char letter7 = str1.charAt(6);
        char letter8 = str1.charAt(7);
        //System.out.println(str1.charAt(8)); //StringIndexOutOfBondException

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);
        System.out.println(letter6);
        System.out.println(letter7);
        System.out.println(letter8);

        System.out.println();

        String str2 = "Chicago Fairfax NewYork Boston";
        String city1 = "Chicago";
        String city2 = "FairFax";
        String city3 = "NewYork";
        String city4 = "Boston";


        //Q: Get me teh 1 city
        //A: use substring method with indexOf method to get the first one


        //Declare String array

        String [] cities;   //just a declaration -> like: int a;

        //Declare String array and assign a value directly
        //Option 1 for assigning the value
        String [] cities1 = {"Chicago", "FairFax", "NewYork", "Boston"}; //we have made String array with initial 4 values added directly
        String [] cities2 = {city1, city2, city3, city4}; //we have made String array with initial 4 values using previously made String variables


        //Option 2 for assigning the value
        String [] cities3 = new String [4]; //we have made String array with 4 element locations with no values in them


        //Q: How can I read the elements from array (How do we read each char from String
        //A: Similar to String, we will be using indexes to the element at the given index
        System.out.println( city1.charAt(0) ); //"Chicago" -> 'C'
        System.out.println( cities1[0] );  //{"Chicago", "FairFax", "NewYork", "Boston"}
        //Indexes                                          0          1          2         3
        System.out.println( cities1[1]);
        System.out.println( cities1[2]);
        System.out.println( cities1[3]);
        //System.out.println( cities1[4]); ArrayIndexOutOfBoundsException


        //Q: How can I print all the elements in array
        System.out.println(cities1); //[Ljava.lang.String;@27716f4 we cannot print the array directly. It will give us some memory location

        System.out.println(Arrays.toString(cities1));

        String arrayInString = Arrays.toString(cities1); //"[Chicago, FairFax, NewYork, Boston]"
        System.out.println(arrayInString);


        //Q: How can I get rid of [ - ] - ,
        arrayInString = arrayInString.substring(1, arrayInString.length()-1).replace(",", "");
        System.out.println(arrayInString);  // Method chaining


        System.out.println();
        System.out.println( Arrays.toString(cities1) );
        System.out.println( Arrays.toString(cities2) );
        System.out.println( Arrays.toString(cities3) ); //default value for String - null (memory location empty)

        System.out.println();
        //Q: How can I see how many elements are in array?
        System.out.println(city1.length()); //"Chicago" -> 7 characters
        System.out.println(cities1.length); //{"Chicago", "FairFax", "NewYork", "Boston"}
        System.out.println(cities2.length); //{city1, city2, city3, city4}
        System.out.println(cities3.length); //new String [4]; -> [null, null, null, null] -> 4

    }
}
/*
Declaration & assigning array
        String [] cities1 = {"Chicago", "Fairfax", "NewYork", "Boston"};
        String [] cities3 = new String [4];
    Printing Array
        Arrays.toString (arrName);
    Size of array
        arrName.length;
    Getting element from array
        arrayName[index]
 */
