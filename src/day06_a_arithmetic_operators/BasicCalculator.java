package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 = 7; //double>int | implisit casting --> 7.0
        double num2 = 5;

        double additionResult = num1 + num2;
        double subtractionResult = num1-num2;
        double multiplicationResult = num1*num2;
        double divisionResult = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + additionResult);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);

    }
}
