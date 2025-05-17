package day05_variables;
/*
    create a class CellPhone
    create a main method
    declare and assign these variables:
        brand, model, color, price, storage, hasCamera, sim(char A, B, C)

    Print all the variables

        sample data: apple, iphone 10, black, 1000.99, 128, true, A
 */
public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iPhone 16Pro";
        String color = "Black";

        double price = 1100.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an" + model + "from" + brand + ".");
        System.out.println("It came with " + color + "andwith storage of " + storage + " GB.");
        System.out.println("For the Sim type " + " with a camera: " + hasCamera + ", the total price is $" + price);

    }
}
