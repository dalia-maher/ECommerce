/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.dao;

import com.mycompany.model.entities.Category;
import java.util.ArrayList;

/**
 *
 * @author Dalia
 */
public interface CategoryDAO {
    
    public boolean insertCategorey(String name);

    public Category getCategory(int categoryID);
    
    public boolean deleteCategorey(String name);

    public ArrayList<Category> getAllCategories(); // for the homepage
}
