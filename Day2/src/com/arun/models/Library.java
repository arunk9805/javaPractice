package com.arun.models;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added!");
    }

    public void listBook() {
        for(Book book: books) {
            System.out.println("Total Books: " + books.size());
            book.displayBookDetails();
        }
    }
}
