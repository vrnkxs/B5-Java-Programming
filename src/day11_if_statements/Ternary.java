package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {
        int a = 71;
        String result;

        //option1 - with regular IF_ELSE statement
        if (a % 2  == 0) {
            //System.out.println("Even");
            result = "Even";
        } else {
            //System.out.println("Odd");
            result = "Odd";
        }
        System.out.println(result);

        System.out.println("-------------------");
        //option2 - with TERNARY
        //SYNTAX:    (condition) ? trueValue : falseValue
        String result2 = (a % 2  == 0) ? "Even" : "Odd";
        System.out.println(result2);

        /*
        RULES
            -when you assign the result of the ternary to a variable, the DATATYPE of the values has to be SAME and match to the variable datatype
            -when you use the result of the in PRINT statement, the DATATYPE of the values does not have to be same
         */

        System.out.println("--------------------------");
        System.out.println((5>2) ? "5 is bigger than 2" : -100);
        //System.out.println((5<2) ? "5 is bigger than 2" : -100);

        if (5 > 2) {
            System.out.println("5 is bigger than 2");
        } else {
            System.out.println(-100);
        }

    }
}