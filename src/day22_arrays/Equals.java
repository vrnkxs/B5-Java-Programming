package day22_arrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4,};
        int [] b = {1, 2, 3, 4,};
        int [] c = a;

        System.out.println(a == b); //do not use "==" when comparing array / any objects
        System.out.println(a == c); //same memory location since pointing to the same, BUT do not use "==" when comparing array / any objects

        System.out.println("----------------------------");

        //Comparing actual arrays / objects value
        System.out.println( Arrays.equals(a, b) );
        System.out.println( Arrays.equals(a, c) );
        System.out.println( Arrays.equals(b, c) );

        boolean isAandBEqual = Arrays.equals(a, b);

        System.out.println("----------------------------");

        int [] d = {4, 3, 2, 1};
        System.out.println( Arrays.equals(a, d) ); //when it compares the arrays, the locations of each element has to match as well

        //can you check if both arrays have the same elements

        Arrays.sort(a);
        Arrays.sort(d);
        System.out.println( Arrays.equals(a, d) );
    }
}
