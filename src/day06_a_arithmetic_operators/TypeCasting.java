package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 40;
        int i = b;    // IMPLICIT CASTING / WIDENING CASTING - AUTOMATICALLY; CONVERTING BYT INTO INT | INT>BYTE
        System.out.println(b);
        System.out.println(i);
        System.out.println();

        int i2 = 100;
        //byte b2 = i2; //cannot assign IMPLICITLY;
        byte b2 = (byte)i2; //EXPLICIT CASTING/NARROWING - MANUALLY: CONVERTING INT INTO BTYE \ INT>BUTE
        System.out.println(i2);
        System.out.println(b2);

        int i3 = 150;
        //byte b3 = i3;
        byte b3 = (byte)i3;
        System.out.println(i3);
        System.out.println(b3);   //since i3 is holding the data/value, which is outside of the range that b3 can hold, there is a data loss happening.

        int i4 = 500;
        long l4 = i4; //IMPLICIT CXASTING/WIDENING CASTING - converting int into long \ long>int
        System.out.println(i4);
        System.out.println(l4);

        long l5 = 500;
        //int i5 = l5; //long>int, so explicit casting is needed;
        int i5 = (int)l5; //explicit casting/narrowing
        System.out.println(l5);
        System.out.println(i5);


        int i6 = 50;
        double d6 = i6; //implicit casting / widening
        System.out.println(i6);
        System.out.println(d6);

        double d7 = 50.0;
        //int i7 = d7;
        int i7 = (int)d7; //explicit casting
        System.out.println(d7);
        System.out.println(i7);

        double d8 = 50.97;
        //int i8 = d8;
        int i8 = (int)d8; //explicit casting - portion of the data will be lost
        System.out.println(d8);
        System.out.println(i8);

        long l9 = 12;
        //int i9 = l9;
        int i9 = (int)l9;
        int i10 = (short)l9; //long into short (explicit) | short into int (implicit)
        int i11 = (byte)l9; //long into byte (explicit) | byte into int (implicit)


    }
}
