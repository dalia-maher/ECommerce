/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.dao.impl;

import com.mycompany.model.dao.OrderDAO;
import com.mycompany.model.entities.CartPK_;
import com.mycompany.model.entities.User;
import com.mycompany.model.entities.UserOrder;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;


/**
 *
 * @author eslam
 */
@Transactional
@Component()
public class OrderDAOImpl implements OrderDAO{
    
    @PersistenceContext
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public boolean addOrder(User user, UserOrder order) {
              
        order.setUserId(user);
        entityManager.persist(order);
        return true;
    }

    @Override
    public List<UserOrder> retreiveOrders(int userId) {
        
        ArrayList<UserOrder> orders=(ArrayList<UserOrder>) entityManager.createNamedQuery("User.findByUserId");
        return orders;
    }
    
    
}
