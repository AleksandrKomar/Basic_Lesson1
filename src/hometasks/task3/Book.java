package hometasks.task3;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        System.out.print("������� �������� ����� - ");
        title.setTitle(input.nextLine());

        System.out.print("������� ������ ����� - ");
        author.setAuthor(input.nextLine());

        System.out.println("������� ���������� ����� ����� - ");
        content.setCocontent(input.nextLine());

        title.show();
        author.show();
        content.show();
    }

}
