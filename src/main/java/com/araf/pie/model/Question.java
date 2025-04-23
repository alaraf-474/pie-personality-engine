package com.araf.pie.model;

public class Question {
    private String id;
    private String text;
    private String category;

    public Question() {}

    public Question(String id, String text, String category) {
        this.id = id;
        this.text = text;
        this.category = category;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
