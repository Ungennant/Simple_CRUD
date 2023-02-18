package org.serf.librarySystem.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {

    private int id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 1, max = 65, message = "Name should be between 1 and 65 characters")
    private String name;
    @NotEmpty(message = "Author field should not be empty")
    @Size(min = 2, max = 30, message = "Author field should be between 2 and 30 characters")
    private String author;
    @Min(value = 0, message = "Publication date should be greater than 0")
    private int publicationDate;

    public Book() {
    }

    public Book(int id, String name, String author, int publicationDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publicationDate = publicationDate;
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

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}
