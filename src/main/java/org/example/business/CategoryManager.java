package org.example.business;

import org.example.dataAccess.CategoryDao;
import org.example.entities.Category;
import org.example.logging.Logger;


public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] category;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] category) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.category = category;

    }

    public void add(Category category) {
        for (Category category_ : this.category) {
            if (category_.getName().equals(category.getName())) {
                System.out.println("Kategori ismi tekrar edemez.");
            } else {
                categoryDao.add(category);
                System.out.println("Kategori eklendi : " + category.getName());
            }
        }

        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }
}
