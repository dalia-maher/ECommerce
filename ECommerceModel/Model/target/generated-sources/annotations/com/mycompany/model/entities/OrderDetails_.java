package com.mycompany.model.entities;

import com.mycompany.model.entities.OrderDetailsPK;
import com.mycompany.model.entities.Product;
import com.mycompany.model.entities.UserOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-30T10:39:25")
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, OrderDetailsPK> orderDetailsPK;
    public static volatile SingularAttribute<OrderDetails, Product> product;
    public static volatile SingularAttribute<OrderDetails, UserOrder> userOrder;
    public static volatile SingularAttribute<OrderDetails, Integer> quantityOrdered;

}