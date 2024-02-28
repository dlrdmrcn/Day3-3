package org.example.business;

import org.example.dataAccess.InstructorDao;
import org.example.entities.Instructor;
import org.example.logging.Logger;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void addInstructor(Instructor instructor) {
        instructorDao.addInstructor(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getName());
        }
        System.out.println(instructor.getName());

    }
}
