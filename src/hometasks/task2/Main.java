package hometasks.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("������� ����� ������� a - ");

        rect.side1 = input.nextDouble();

        System.out.print("������� ����� ������� b - ");

        rect.side2 = input.nextDouble();

        System.out.println("������� �������������� = " + rect.areaCalculator(rect.side1, rect.side2));
        System.out.println("�������� �������������� = " + rect.perimetrCalculator(rect.side1, rect.side2));


    }
}
