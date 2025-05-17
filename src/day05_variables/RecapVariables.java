package day05_variables;
/*
    Variable Naming Conventions
        hell1@ - not ok - this @ special carachtwe is not allowed in variable names
        12 test - not ok - cannot start with a number. number can be anywhere except begining
        $public - ok - $ is allowed special character
        _34hello - ok - _ is allowed special characteer
        staticTest - ok - ststicTest is a variable name. "static" is not allowed alone
        Package - ok - since it is with a capital we can

        - camel case
        - any letters including upper or lower case
        - any numbers can be anywhere except the begining
        - 2 special


 */

public class RecapVariables {
    public static void main(String[] args) {

        //declare variables
        byte numbOfCoffeeCups;
        double totalPriceOfCoffee;
        int numOfStudents;

        //#1 - we cannot use the container/variable if it does not have a value assigned
        //System.out.println(numOfCoffeeCups);
        //System.out.println(totalPriceOfCoffee); //totalPriceOfCoffee.sout
        //System.out.println("numOfStudents = " + numOfStudents); //numOfStudents.soutv

        //assign initial values / initialize them
        numbOfCoffeeCups = 10;
        totalPriceOfCoffee = 20.22;
        numOfStudents = 20;

        System.out.println(numbOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(numOfStudents);

        //
    }
}
