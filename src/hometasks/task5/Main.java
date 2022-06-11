package hometasks.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();

        Scanner input = new Scanner(System.in);

        System.out.print("¬ведите страну - ");
        address.setCountry(input.nextLine());

        System.out.print("¬ведите город - ");
        address.setCity(input.nextLine());

        System.out.print("¬ведите улицу - ");
        address.setStreet(input.nextLine());

        System.out.print("¬ведите номер дома - ");
        address.setHouse(input.nextLine());

        System.out.print("¬ведите квартиру - ");
        address.setApartment(input.nextLine());

        System.out.print("¬ведите индекс - ");
        address.setIndex(input.nextInt());

        System.out.println(address.toString());

    }
}
