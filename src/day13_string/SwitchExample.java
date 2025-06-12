package day13_string;

public class SwitchExample {
    public static void main(String[] args) {
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("Before arithmetic operator applied your num: " + num);
                num *= 10;
                System.out.println("After arithmetic operator applied your num: " + num);
                break;
            case 2:
                System.out.println("Before modules operator applied to your num: " + num);

                if (num % 2 == 0) {
                    System.out.println("Your num is EVEN number");
                } else {
                    System.out.println("Your num is ODD number");
                }

                break;


        }

        System.out.println("---------------------------------------------------------------------");

        int num2 = 6;

        if (num2 < 4) {
            System.out.println("Your number is less than 4");
        } else {

            switch (num2) {
                case 4:
                case 5, 6:
                    System.out.println("Your number is between 4 and 6");
                    break;
                case 7:
                    System.out.println("Your number is 7");
                    break;
                default:
                    System.out.println("Your number is above 7");
            }
        }

    }
}
