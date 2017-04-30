/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.dao.impl;

import com.mycompany.model.dao.CategoryDAO;
import com.mycompany.model.entities.Category;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dalia
 */

@Transactional
@Component
public class CategoryDAOImpl implements CategoryDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean insertCategorey(String name) {
        Category category = new Category();
        category.setCategoryName(name);
        entityManager.persist(category);
        System.out.println("Category is inserted successfully!");
        return true;
    }

    @Override
    public Category getCategory(int categoryID) {
        Category category = entityManager.find(Category.class, categoryID);
        return category;
    }

    @Override
    public boolean deleteCategorey(String name) {
        Category category = (Category) entityManager.createNamedQuery("Category.findByCategoryName").setParameter("categoryName", name).getSingleResult();
        entityManager.remove(category);
        return true;
    }

    @Override
    public ArrayList<Category> getAllCategories() {
        ArrayList<Category> categories = (ArrayList<Category>) entityManager.createNamedQuery("Category.findAll").getResultList();
        return categories;
    }
    
}
