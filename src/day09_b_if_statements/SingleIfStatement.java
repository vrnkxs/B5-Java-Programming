package day09_b_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {

        //single IF statement - with direct boolean value
        //condition will be true/false
        if (false){
            System.out.println("1st print");
        }

        //this is just a print statement
        System.out.println("2nd print");

        System.out.println("--------------------------");
        //single if statement - with relational operators with results in true/false

        int age = 10;
        if(age >=75) { //if true, do the code block of if statement, if false, do nothing (skip code block)
            System.out.println("You are a senior citizen");
        }

        if (age < 75) {
            System.out.println("You are not senior citizen");
        }

        System.out.println("--------------------------");
        //single if statement with logical operators, which results in true/false
        boolean isCitizen = true;
        boolean is18YO = age >=18;

        //person is only eligible if he/she is citizen and at least 18yo
        if (is18YO && isCitizen) {  //false &&true -> false
            System.out.println("You are eligible to vote");
            System.out.println("Please go to the closest voting location to vote");
        }

        if (!isCitizen) { //false
            System.out.println("You do not need passport to enter your country");
        }
    }
}
