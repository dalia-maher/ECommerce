/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Dalia
 */
@Embeddable
public class ProductImagesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "product_img")
    private String productImg;

    public ProductImagesPK() {
    }

    public ProductImagesPK(int productId, String productImg) {
        this.productId = productId;
        this.productImg = productImg;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productId;
        hash += (productImg != null ? productImg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductImagesPK)) {
            return false;
        }
        ProductImagesPK other = (ProductImagesPK) object;
        if (this.productId != other.productId) {
            return false;
        }
        if ((this.productImg == null && other.productImg != null) || (this.productImg != null && !this.productImg.equals(other.productImg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.entities.ProductImagesPK[ productId=" + productId + ", productImg=" + productImg + " ]";
    }
    
}
