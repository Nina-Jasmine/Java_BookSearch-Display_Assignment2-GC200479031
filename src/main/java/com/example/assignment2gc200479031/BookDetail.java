package com.example.assignment2gc200479031;

import java.util.Arrays;

public class BookDetail {

    private String title;
    private String subtitle;
    private String[] authors;

    private String publisher;
    private String publishedDate;
    private String description;
    private ImageLink imageLinks;

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getAuthors() {
        return Arrays.toString(authors);
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

    public ImageLink getImageLink() {
        return imageLinks;
    }

    public String toString()
    {
        return String.format("%s (%s, %s)",title, getAuthors(), publishedDate);
    }
}
