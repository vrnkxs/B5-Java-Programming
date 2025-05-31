package day05_variables;

public class BooleanExample {
    public static void main(String[] args) {
        // boolean datatype can ol=nly hold two values - try/false
        boolean isSleepy = true;
        boolean isHungry = false;
        boolean isWeekDay = true;
        boolean isWeekend = false;

        System.out.println("is Sleepy?" + isSleepy);
        System.out.println("is Hungry?" + isHungry);
        System.out.println("is WeekDay?" + isWeekDay);
        System.out.println("is Weekend?" + isWeekend);

        System.out.println("-------------------");

        System.out.println("Is Happy?" + true);

        int age = 50;
        System.out.println("He is " + age + " years old.");
        System.out.println("He is " + age + " years old.");
        System.out.println("He is " + 60 + " years old.");
        System.out.println("He is " + 60 + " years old.");

        //Using data itself directly VS using data through variable.
        System.out.println();
        System.out.println(false); //using Data directly
        System.out.println(true); //using Data directly

        boolean canJump = false;
        System.out.println(canJump); //using Data through variable
        System.out.println(canJump); //using Data through variable

        System.out.println();
        System.out.println(6);  //using Data directly
        System.out.println(5);  //using Data directly

        int a = 7;
        System.out.println(a); //using Data through variable
        System.out.println(a); //using Data through variable
    }
}
