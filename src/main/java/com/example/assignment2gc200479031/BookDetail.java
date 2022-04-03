package com.example.assignment2gc200479031;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.Arrays;

public class BookDetail extends Book{

    private String title, subtitle, publisher, publishedDate, description, language, infoLink;
    private String[] authors, categories;
    private int pageCount, ratingsCount;
    private Double averageRating;
    private ImageLink imageLinks;

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getAuthors() {
        return Arrays.toString(authors).replace("[","").replace("]","");
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {

        return (publishedDate != null) ? publishedDate : " ";
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

    public int getRatingsCount() {
        return ratingsCount;
    }

    public Double getAverageRating() {
        return averageRating;
    }
    //get the title, Year of publishedDate and Authors information to display

    public String toString()
    {
        return String.format("%s (%s, %s)",title, publishedDate.substring(0, 4), Arrays.toString(authors).replace("[","").replace("]",""));
    }

    //This method to return the id based on the parent class Book

   /* @Override
    public String getId() {

        return super.getId();
    }*/

    public String getIdFromBookDetail() {

        return super.getId();
    }
   /*  public Book getBook(){

        return this;
    }*/

    public Class<? super Book> getSuperclass(){
        return this.getSuperclass();
    }
}
