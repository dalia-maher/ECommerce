/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dalia
 */
@Entity
@Table(name = "product_images")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductImages.findAll", query = "SELECT p FROM ProductImages p"),
    @NamedQuery(name = "ProductImages.findByProductId", query = "SELECT p FROM ProductImages p WHERE p.productImagesPK.productId = :productId"),
    @NamedQuery(name = "ProductImages.findByProductImg", query = "SELECT p FROM ProductImages p WHERE p.productImagesPK.productImg = :productImg")})
public class ProductImages implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductImagesPK productImagesPK;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public ProductImages() {
    }

    public ProductImages(ProductImagesPK productImagesPK) {
        this.productImagesPK = productImagesPK;
    }

    public ProductImages(int productId, String productImg) {
        this.productImagesPK = new ProductImagesPK(productId, productImg);
    }

    public ProductImagesPK getProductImagesPK() {
        return productImagesPK;
    }

    public void setProductImagesPK(ProductImagesPK productImagesPK) {
        this.productImagesPK = productImagesPK;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productImagesPK != null ? productImagesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductImages)) {
            return false;
        }
        ProductImages other = (ProductImages) object;
        if ((this.productImagesPK == null && other.productImagesPK != null) || (this.productImagesPK != null && !this.productImagesPK.equals(other.productImagesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.entities.ProductImages[ productImagesPK=" + productImagesPK + " ]";
    }
    
}
