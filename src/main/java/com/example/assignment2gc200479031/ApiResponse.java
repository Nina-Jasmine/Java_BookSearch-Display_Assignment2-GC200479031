package com.example.assignment2gc200479031;

import java.util.ArrayList;

public class ApiResponse {
    private String kind;
    private int totalItems;
    private ArrayList<Book> items;

    public String getKind() {
        return kind;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public ArrayList<Book> getItems() {
        return items;
    }
}
