package controller;

import service.FilmService;

import java.util.Scanner;

public class FilmController {
    private FilmService filmService = new FilmService();


    public void printMenu() {
        System.out.println("********** MENU **********");
        System.out.println("1.Film List");
        System.out.println("2.Search film by name");
        System.out.println("3.Exit\n");
    }

    public int selection() {
        printMenu();
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public void run() {

        int option = selection();

        while (option != 3) {
            switch (option) {
                case 1:
                    System.out.println("Book list:");
                    filmService.prints(filmService.getFilms());
                    break;
                case 2:
                    System.out.println("Enter name:");
                    Scanner scanner = new Scanner(System.in);
                    String name = String.valueOf(scanner.nextLine());

                    System.out.println("Search books with name: " + name);
                    filmService.prints(filmService.searchByName(name));

                    break;

                default:
                    break;
            }

            option = selection();
        }

    }
}
