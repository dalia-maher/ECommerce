package com.mycompany.model.entities;

import com.mycompany.model.entities.UserOrder;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-30T10:39:25")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> zip;
    public static volatile SingularAttribute<User, String> fname;
    public static volatile SingularAttribute<User, String> country;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, String> credite;
    public static volatile SingularAttribute<User, String> city;
    public static volatile SingularAttribute<User, Boolean> userEmailVerified;
    public static volatile SingularAttribute<User, Boolean> isAdmin;
    public static volatile SingularAttribute<User, String> passwordResetToken;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> lname;
    public static volatile ListAttribute<User, UserOrder> userOrderList;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, Date> registrationDate;
    public static volatile SingularAttribute<User, String> confirmToken;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Date> expirationDate;

}