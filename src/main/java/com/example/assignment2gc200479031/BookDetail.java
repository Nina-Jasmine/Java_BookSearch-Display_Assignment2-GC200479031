package com.example.assignment2gc200479031;

public class BookDetail {

    private String title;
    private String subtitle;
    private String[] authors;

    private String publisher;
    private String publishedDate;
    private String description;
    private ImageLink imageLink;

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

    public ImageLink getImageLink() {
        return imageLink;
    }

    public String toString()
    {
        return String.format("%s (%s, %s)",title, authors, publishedDate);
    }
}
