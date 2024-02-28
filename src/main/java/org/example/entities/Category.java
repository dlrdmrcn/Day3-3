package org.example.entities;

public class Category {
    private int id;
    private String name;

    public Category(String categoryName, int id) {
        this.setName(categoryName);
        this.setId(id);
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
}
