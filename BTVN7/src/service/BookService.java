package service;

import model.Book;

import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> books;

    public BookService() {
        init();
    }

    public void init() {
        books = new ArrayList<Book>();
        books.add(new Book("1", "Harry Potter", "Conan doye", "novel", "NXB Nha nam", 2020));
        books.add(new Book("2", "Animal Farm", "unknown", "novel", "NXB Nha nam", 2002));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void printBooks() {
        this.print(this.books);
    }


    public void print(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books");
        }

        for (Book book :
                books) {
            System.out.println(book);
        }
    }

    public void searchByName(String name) {
        var result = new ArrayList<Book>();

        for (Book book : this.books) {

            if (book.getTitle().toLowerCase().contains(name.toLowerCase())) {

                result.add(book);
            }
        }

        print(result);
    }

    public void searchByCategory(String name) {
        var result = new ArrayList<Book>();

        for (Book book : this.books) {

            if (book.getCategory() == name) {

                result.add(book);
            }
        }

        print(result);
    }

    public void searchByYear(Integer year) {
        var result = new ArrayList<Book>();

        for (Book book : this.books) {

            if (book.getYear() == year) {

                result.add(book);
            }
        }

        print(result);
    }

}
