package hometasks.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();

        Scanner input = new Scanner(System.in);

        System.out.print("Введите страну - ");
        address.setCountry(input.nextLine());

        System.out.print("Введите город - ");
        address.setCity(input.nextLine());

        System.out.print("Введите улицу - ");
        address.setStreet(input.nextLine());

        System.out.print("Введите номер дома - ");
        address.setHouse(input.nextLine());

        System.out.print("Введите квартиру - ");
        address.setApartment(input.nextLine());

        System.out.print("Введите индекс - ");
        address.setIndex(input.nextInt());

        System.out.println(address.toString());

    }
}
