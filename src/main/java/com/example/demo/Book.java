package com.example.demo;

public class Book {

    public Book() {
    }

    public Book(Integer id, String title, String category, Integer number, Integer uid) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.number = number;
        this.uid = uid;
    }

    private Integer id;

    private String title;

    private String category;

    private Integer number;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getUid() {
        return uid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
