package controller;

import service.BookService;

import java.util.Scanner;

public class BookController {
    private BookService bookService = new BookService();


    public void printMenu() {
        System.out.println("********** MENU **********");
        System.out.println("1.Book List");
        System.out.println("2.Search book by name");
        System.out.println("3.Search book by category");
        System.out.println("4.Search book by year");
        System.out.println("5.Exit\n");
    }

    public int selection() {
        printMenu();
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public void run() {

        int option = selection();

        while (option != 5) {
            switch (option) {
                case 1:
                    System.out.println("Book list:");
                    bookService.printBooks();
                    break;
                case 2:
                    System.out.println("Enter name:");
                    Scanner scanner = new Scanner(System.in);
                    String name = String.valueOf(scanner.nextLine());

                    System.out.println("Search books with name: " + name);
                    bookService.searchByName(name);
                    break;

                case 3:
                    System.out.println("Enter name:");
                    Scanner scanner1 = new Scanner(System.in);
                    String category = String.valueOf(scanner1.nextLine());

                    System.out.println("Search books with category: " + category);
                    bookService.searchByCategory(category);
                    break;

                case 4:
                    System.out.println("Enter name:");
                    Scanner scanner2 = new Scanner(System.in);
                    int year = Integer.parseInt(scanner2.nextLine());

                    System.out.println("Search books with year: " + year);
                    bookService.searchByYear(year);
                    break;

                default:
                    break;
            }

            option = selection();
        }

    }
}
