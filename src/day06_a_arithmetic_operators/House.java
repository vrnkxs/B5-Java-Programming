package day06_a_arithmetic_operators;

public class House {
    public static void main(String[] args) {
        //Single house, Town house, Apartment, Penthouse, Multifamily
        String houseType = "Penthouse", address = "123 Test St, Fairfax, VA";

        //The following will give an error, because Java reads from top to bottom, and the variables not declared yet before they are being used
        //
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        int zipcode = 22033;

        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isForSale = true;
        boolean isParkNearby = false;

        double costOfTheHouse = 675_000.99;
        double schoolRating = 4.5;

        System.out.println("The " + houseType + " is located at " + address + " " + zipcode + ".");
        System.out.println("");





    }
}
