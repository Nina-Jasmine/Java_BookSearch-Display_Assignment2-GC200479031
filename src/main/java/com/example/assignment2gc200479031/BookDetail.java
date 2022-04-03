package com.example.assignment2gc200479031;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.Arrays;

public class BookDetail extends Book{

    private String title, subtitle, publisher, publishedDate, description, language, infoLink;
    private String[] authors, categories;
    private int pageCount;
    private ImageLink imageLinks;

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getLanguage() {
        return language;
    }

    public String getInfoLink() {
        return infoLink;
    }

    public int getPageCount() {
        return pageCount;
    }

    public ImageLink getImageLinks() {
        return imageLinks;
    }

    //get the title, Year of publishedDate and Authors information to display

    public String toString()
    {
        return String.format("%s (%s, %s)",title, publishedDate.substring(0, 4), Arrays.toString(authors).replace("[","").replace("]",""));
    }

    //This method to return an instance of members has this bookDetail instance
    public Book getBook(){

        Book book = new Book();
        return book;
    }
}
