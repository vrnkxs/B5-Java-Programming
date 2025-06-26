package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] str = {"java", "hello", "by", "Hi", "Apple", "Abc", "4", "3", "&", "?"};
        System.out.println("Before sorted: " + Arrays.toString(str));

        //NOTE: Order of String sorting: special characters > numbers > upper case > lower case; then alphabetic order
        //String sorting follows the ASCII table order

        Arrays.sort(str);
        System.out.println("After sorted: " + Arrays.toString(str));
    }
}
