package org.example.dataAccess;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;

public class JdbcDao implements CourseDao, CategoryDao, InstructorDao {

    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile kategori Eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile kurs Eklendi.");
    }


    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen eklendi.");
    }
}
