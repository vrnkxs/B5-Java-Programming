package day04_variables;
/*
    Primitive Data Types
    WHOLE NUMBERS / INTEGER TYPE:   byte, short, int, long -> if u use data directly, java takes it as "int" by default
    DECIMAL NUMBERS / FLOATING TYPE: float, double
 */


public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //Declaring variable --- > Datatype VariableName;

        // If your container will hold WHOLE NUMBERS: byte, short, int, long
        // If your container will hold DECIMAL NUMBERS: float, double

        byte age;
        //System.out.println(age); //at this line, since variable age does not have value, nothing will be printed, so it is erroring
        //byte age = 10; //we cannot declare the same variable name in the same method
        //int age = 10; //still we cannot declare the same variable name if data type is different on the same method
        age=10; // in this line we have-assign initial value (first time giving value). we have initialised variable
        System.out.println(age); //since age variable has value in it, my code can print it out

        System.out.println("age"); // here we are printing the DATA itself directly - data is letters (String)
        System.out.println(10); //here we are printing the DATA itself directly - data is whole number (int as a deufalt)
        System.out.println("10"); //here we are printing the DATA itself directly - data is letter (String)

        age = 20; //here we REASSIGNED a new value which is 20 to variable age
        System.out.println(age);

        //age = 200; // we cannot assign a data which is outside of the range that byte can hold

        System.out.println();
        //Declaring variable + assigned initial value --- > Datatype VariableName = value/data
        short year = 2025; //
        System.out.println(year); //short
        System.out.println(2025); //int


        //Declaring variable
        int addressNumber;
        //assigning data/va;ue into variable called addressNumber
        addressNumber = 129482;
        System.out.println(addressNumber); // int
        System.out.println(129482); //int
        System.out.println("129482"); // letter - string

        //Declaring variable
        long creditCardNumber;
        //assigning value / initializing variable
        //creditCardNumber = 123456756789; //lowercase L at the end
        creditCardNumber = 1234899898956756789L; //uppercase L at the end,

        System.out.println(1234899898956756789L); //since java takes the data as int by default, and since this number is outside of the range that int can hold, we need to follow the syntax and add "L" ot "l"

    }
}
