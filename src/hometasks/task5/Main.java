package hometasks.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();

        Scanner input = new Scanner(System.in);

        System.out.print("������� ������ - ");
        address.setCountry(input.nextLine());

        System.out.print("������� ����� - ");
        address.setCity(input.nextLine());

        System.out.print("������� ����� - ");
        address.setStreet(input.nextLine());

        System.out.print("������� ����� ���� - ");
        address.setHouse(input.nextLine());

        System.out.print("������� �������� - ");
        address.setApartment(input.nextLine());

        System.out.print("������� ������ - ");
        address.setIndex(input.nextInt());

        System.out.println(address.toString());

    }
}
