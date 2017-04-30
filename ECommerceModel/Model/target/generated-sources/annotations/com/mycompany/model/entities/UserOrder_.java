package com.mycompany.model.entities;

import com.mycompany.model.entities.OrderDetails;
import com.mycompany.model.entities.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-30T15:25:52")
@StaticMetamodel(UserOrder.class)
public class UserOrder_ { 

    public static volatile SingularAttribute<UserOrder, String> zip;
    public static volatile SingularAttribute<UserOrder, String> country;
    public static volatile SingularAttribute<UserOrder, Integer> orderId;
    public static volatile SingularAttribute<UserOrder, String> city;
    public static volatile SingularAttribute<UserOrder, String> phone;
    public static volatile ListAttribute<UserOrder, OrderDetails> orderDetailsList;
    public static volatile SingularAttribute<UserOrder, String> state;
    public static volatile SingularAttribute<UserOrder, User> userId;
    public static volatile SingularAttribute<UserOrder, String> shipAddress;

}