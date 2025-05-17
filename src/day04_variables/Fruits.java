package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int appleCount = 80;
        int grapeCount = 100;
        int bananasCount = 150;


        System.out.println("This is how may apples we have: 80"); // Hard coding - using static value
        System.out.println("I have sold 50 apples");
        //appleCount = 30; //reassigned new value
        System.out.println("This is how many apples left 30");
        System.out.println();

        System.out.println("This is how may apples we have: "+appleCount);
        System.out.println("I have sold 50 apples");
        appleCount = 80-50; //reassigned new value
        System.out.println("This is how many apples left 30");


        int appleTotalPrice = 15;
        //This price of my 30 apples is $15 //hardcode way use the data
        System.out.println("This price of my " + appleCount + "apples is $" + appleTotalPrice); // dynamicly used the data

        System.out.println();

        //CONCATENATION - > after first double quote, everything is put next to each other
        System.out.println(10+10); // NO doible quotation in this line of code
        System.out.println("" + 10 + 10);



    }
}
