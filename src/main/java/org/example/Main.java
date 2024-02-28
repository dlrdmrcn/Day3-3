package org.example;

import org.example.business.CategoryManager;
import org.example.business.CourseManager;
import org.example.business.InstructorManager;
import org.example.dataAccess.HibernateDao;
import org.example.dataAccess.JdbcDao;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.logging.DatabaseLogger;
import org.example.logging.FileLogger;
import org.example.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
        Instructor instructor2 = new Instructor(2, "Halil Enes Kalaycı");

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        InstructorManager instructorManager = new InstructorManager(new JdbcDao(), loggers);
        instructorManager.addInstructor(instructor1);
        instructorManager.addInstructor(instructor2);

        Category category1 = new Category("Programlama", 1);
        Category category2 = new Category("Algoritma", 2);

        Category[] categories = {category2};

        CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers, categories);
        categoryManager.add(category1);

        Course course1 = new Course(1, "Programlamaya Giriş İçin Temel Kurs", category1, instructor1, 0);
        Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", category1, instructor1, 201);

        CourseManager manager = new CourseManager(new HibernateDao(), loggers);
        manager.add(course1);
        manager.add(course2);
    }
}