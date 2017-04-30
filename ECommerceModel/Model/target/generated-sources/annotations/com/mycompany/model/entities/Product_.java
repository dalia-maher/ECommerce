package com.mycompany.model.entities;

import com.mycompany.model.entities.Category;
import com.mycompany.model.entities.OrderDetails;
import com.mycompany.model.entities.ProductImages;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-30T15:25:52")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, Integer> quantity;
    public static volatile SingularAttribute<Product, Integer> productId;
    public static volatile SingularAttribute<Product, Float> price;
    public static volatile ListAttribute<Product, OrderDetails> orderDetailsList;
    public static volatile SingularAttribute<Product, Short> available;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile ListAttribute<Product, ProductImages> productImagesList;
    public static volatile SingularAttribute<Product, String> productName;
    public static volatile SingularAttribute<Product, Category> productCategory;

}