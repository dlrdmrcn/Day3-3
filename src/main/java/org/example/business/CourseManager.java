package org.example.business;

import org.example.dataAccess.CourseDao;
import org.example.entities.Course;
import org.example.logging.Logger;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao dao, Logger[] loggers) {
        this.courseDao = dao;
        this.loggers = loggers;
    }

    public void add(Course course) {

        if (course.getPrice() < 0) {
            System.out.println("Kurs fiyatı sıfırdan küçük olamaz.");
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getName());
        }
    }
}
