/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.dao;

import com.mycompany.model.entities.User;
import com.mycompany.model.entities.UserOrder;
import java.util.List;

/**
 *
 * @author eslam
 */
public interface OrderDAO {
    
    public boolean addOrder(User user,UserOrder order);
    
    public List<UserOrder> retreiveOrders(int userId);
}
