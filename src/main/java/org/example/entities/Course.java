package org.example.entities;

public class Course {
    private int _id;
    private String _name;
    private Category _category;
    private Instructor _instructor;
    private double _price;

    public Course(int id, String courseName, Category category, Instructor instructor, int price) {
        _id = id;
        _name = courseName;
        _instructor = instructor;
        _category = category;
        _price = price;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Category getCategory() {
        return _category;
    }

    public void setCategory(Category category) {
        _category = category;
    }

    public Instructor getInstructor() {
        return _instructor;
    }

    public void setInstructor(Instructor instructor) {
        _instructor = instructor;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }
}
