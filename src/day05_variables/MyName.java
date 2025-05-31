package day05_variables;

public class MyName {
    public static void main(String[] args) {
       char l1 = 'n';
       char l2 = 'i';
       char l3 = 'k';
       char l4 = 'a';

        System.out.println(l1);
        System.out.println("second: " + l2);
        System.out.println("third: " + l3);
        System.out.println("fourth: " + l4);

        System.out.println();

        System.out.println(l1+0);
        System.out.println(l2+0);
        System.out.println(l3+0);
        System.out.println(l4+0);

        System.out.println(l1+l2+l3+l4);

        //"nika"
        String name = "" + l1+l2+l3+l4;
        System.out.println(name);

        char letter1 = 2347;
        System.out.println(letter1);

        char letter2 = 694;
        System.out.println(letter2);
    }
}
