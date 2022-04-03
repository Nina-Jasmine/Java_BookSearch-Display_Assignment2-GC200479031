package com.example.assignment2gc200479031;

import com.google.gson.annotations.SerializedName;

public class Book {

    private String id;

    @SerializedName("volumeInfo")
    private BookDetail bookDetail;

    public String getId() {
        return id;
    }

    public BookDetail getBookDetail() {
        return bookDetail;
    }


}
