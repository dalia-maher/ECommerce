/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.dao.impl;

import com.mycompany.model.dao.ProductDAO;
import com.mycompany.model.entities.Product;
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
public class ProductDAOImpl implements ProductDAO {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean addProduct(Product product) {
        entityManager.persist(product);
        System.out.println("Product is inserted successfully!");
        return true;
    }

    @Override
    public boolean deleteProduct(int productID) {
        Product product = entityManager.find(Product.class, productID);
        entityManager.remove(product);
        return true;
    }

    // todo
    @Override
    public ArrayList<Product> getAllProducts(int offset, int limit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> products = (ArrayList<Product>) entityManager.createNamedQuery("Product.findAll").getResultList();
        return products;
    }

    @Override
    public ArrayList<Product> getProductsCategory(int categoryID) {
        ArrayList<Product> products = (ArrayList<Product>) entityManager.createNamedQuery("Product.findByCategory").setParameter("categoryId", categoryID).getResultList();
        return products;
    }

    @Override
    public boolean editProduct(int old, Product neww) {
        Product product = entityManager.find(Product.class, old);
        product.setAvailable(neww.getAvailable());
        product.setDescription(neww.getDescription());
        product.setImage(neww.getImage());
        product.setOrderDetailsList(neww.getOrderDetailsList());
        product.setPrice(neww.getPrice());
        product.setProductCategory(neww.getProductCategory());
        product.setProductImagesList(neww.getProductImagesList());
        product.setProductName(neww.getProductName());
        product.setQuantity(neww.getQuantity());
        entityManager.merge(product);
        return true;
    }

    @Override
    public boolean updateProductQuantity(int productID, int newQuantity) {
        Product product = entityManager.find(Product.class, productID);
        product.setQuantity(newQuantity);
        entityManager.merge(product);
        return true;
    }

//    @Override
//    public ArrayList<Product> searchProduct(String query) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ArrayList<Product> searchProductByPrice(double price) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public Product getProduct(int productID) {
        Product product = entityManager.find(Product.class, productID);
        return product;
    }
    
    
}
