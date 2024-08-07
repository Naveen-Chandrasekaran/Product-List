package com.example.productlist;
import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String title;
    private String description;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
