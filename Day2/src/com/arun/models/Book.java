package com.arun.models;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails () {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("============================================");
    }

    public void discount (double percent) {
        this.price = price - ((percent * price)/100);
        displayBookDetails();
    }

    public void discount (boolean isFestival, double percent) {
        if(isFestival) {
            this.price = price - ((2*percent * price)/100);
            displayBookDetails();
        }
        else {
            discount(percent);
        }
    }

    public double getPrice () {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        displayBookDetails();
    }
}
