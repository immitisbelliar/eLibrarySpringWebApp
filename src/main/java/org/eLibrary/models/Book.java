package org.eLibrary.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Book {

    private int id;

    @NotEmpty(message = "Name of the book should not be empty")
    private String name;

    @NotEmpty(message = "Author's name should not be empty")
    private String author;

    @NotNull(message = "Book release year should be greater than 0")
    @Min(value = 0, message = "Book release year should be greater than 0")
    private String year;

    public Book() {

    }

    public Book(int id, String name, String author, String year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
