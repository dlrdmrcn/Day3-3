package org.example.dataAccess;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;

public class HibernateDao implements CourseDao, CategoryDao, InstructorDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile kategori eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile kurs eklendi.");
    }

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen eklendi.");
    }
}
