package com.lab5;

public class Book extends Item{
    private int isbn_number;
    private String author;

    public int getIsbn_number() {
        return isbn_number;
    }
    public void setIsbn_number(int isbn_number) {
        this.isbn_number = isbn_number;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book() { }
    public Book(String title, int isbn_number, String author) {
        super(title);
        this.isbn_number = isbn_number;
        this.author = author;
    }
    public String getListing() {
        return "Book Name - " + this.getTitle() + "\n" + "Author - " + this.getAuthor() + "\n" + "ISBN# - " + this.getIsbn_number() +  "\n";
    }
}
