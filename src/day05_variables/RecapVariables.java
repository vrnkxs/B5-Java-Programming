package day05_variables;
/*
    Variable Naming Conventions
        hell1@      - NO OK - this @ special character is not allowed in variable names
        12test      - NO OK - cannot start number. Number can be anywhere except beginning
        $public     - OK    - $ is allowed special character
        _34hello    - OK    - _ is allowed special character
        staticTest  - OK    - staticTest is a valid variable name. "static" is not allowed alone
        Package     - OK    - since it is with capital P we can but "package" is not allowed

        - camelCase
        - any letters including upper or lower case
        - any number can be anywhere EXCEPT beginning
        - 2 special characters allowed anywhere --- > $, _ (no other special characters)

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
        //System.out.println("numOfStudents = " + numOfStudents); //numOfStudents.sout

        //assign initial values / initialize them
        numbOfCoffeeCups = 10;
        totalPriceOfCoffee = 20.22;
        numOfStudents = 20;

        System.out.println(numbOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(numOfStudents);

        // Printout in this exact format: numOfCoffeeCups * numOfStudents
        System.out.println(numbOfCoffeeCups + " * " + numOfStudents ); // CONCATENATION


        // DECLARE and ASSIGN value directly.
        // = --- > Assignment Operator
        // . --- > Dot Operator [varName.sout]
        // datatype varName = value;
        double temperature = 75.5;
        float earthDiameter = 1274243534.34f; // just a sample. May not be correct info

        System.out.println("Today the temperatures was " + temperature + " degrees Fahrenheit");  // using data dynamically
        System.out.println("Earth's diameter is " + earthDiameter + " km");  // using data dynamically


        System.out.println();
        // We can assign ONE variable to another variable based on which one can hold which
        // byte < short < int < long < float < double
        byte b = 10;
        System.out.println(b);

        short s;
        s = b;
        System.out.println(s);

        int i;
        i = b;
        i = s;
        System.out.println(i);

        long l;
        l = b;
        l = s;
        l = i;
        System.out.println(l);


        float f;
        f = b;
        f = s;
        f = i;
        f = l;
        System.out.println(f);


        double d;
        d = b;
        d = s;
        d = i;
        d = l;
        d = f;
        System.out.println(d);

        //       f = d;
        //
        //       l = f;
        //       l = d;
    }
}
