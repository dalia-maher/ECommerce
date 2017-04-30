/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.dao;

import com.mycompany.model.entities.Product;
import java.util.ArrayList;

/**
 *
 * @author Dalia
 */
public interface ProductDAO {

    public boolean addProduct(Product product); // edit or add the same function

    public boolean deleteProduct(int productID);

    public ArrayList<Product> getAllProducts(int offset, int limit); // for paging

    public ArrayList<Product> getAllProducts();
    
    public ArrayList<Product>getProductsCategory(int categoryID);

    public boolean editProduct(int old, Product neww);

    public boolean updateProductQuantity(int productID, int newQuantity);

//    public ArrayList<Product> searchProduct(String query);
//
//    public ArrayList<Product>searchProductByPrice(double price);
    
    public Product getProduct(int productID);

}
