package hometasks.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Введите длину стороны a - ");

        rect.side1 = input.nextDouble();

        System.out.print("Введите длину стороны b - ");

        rect.side2 = input.nextDouble();

        System.out.println("Площадь прямоугольника = " + rect.areaCalculator(rect.side1, rect.side2));
        System.out.println("Периметр прямоугольника = " + rect.perimetrCalculator(rect.side1, rect.side2));


    }
}
