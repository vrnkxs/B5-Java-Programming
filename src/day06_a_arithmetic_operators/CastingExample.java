package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {
        int num1 = 40;
        float num2 = num1; //float>int
        System.out.println(num1);
        System.out.println(num2);

        float num3 = 50.5f;
        short num4 = (short)num3; // float>short
        System.out.println(num3);
        System.out.println(num4);

        float num5 = 50.35f;
        byte num6 = (byte)num5; //float > byte
        System.out.println(num5);
        System.out.println(num6);

        char letter1 = 'f';
        int letterInt = letter1; //In the ASCCI table, for each char we have a number assigned to it. int>char, so Implicit casting
        System.out.println(letter1);
        System.out.println(letterInt);

        System.out.println('B');
        System.out.println((int)'B');
    }
}
