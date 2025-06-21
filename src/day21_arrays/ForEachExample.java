package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {4, 24, 6, 2};
        //nums.length -> 4

        //fori loop/traditional for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println( nums [i] );
        }

        System.out.println("-------------");
        int [] nums2 = new int[5];

        //loop throgh and assign 10 to all index
        for (int i = 0; i < nums2.length; i++) {
            nums[i] = 10;
        }


        System.out.println("-------------");

        //foreach loop
        //if you do not need specific indexes
        //if you need to get all the elements from beginning all the way to the end
        //{4, 24, 6, 2}
        // 1 cycle - int eachElement = 4;
        // 2 cycle - int eachElement = 24;
        // 3 cycle - int eachElement = 6;
        // 4 cycle - int eachElement = 2;

        for (int eachElement : nums ) {
            System.out.println(eachElement);
            //eachElement = 30;     //this does not reassign values to indexes in array
        }
        System.out.println(Arrays.toString(nums));

        System.out.println("-------------");

        String [] names = {"Tom", "Jim", "Jack"};

        for(String  eachElem : names) {
            System.out.println(eachElem);
        }

    }
}
