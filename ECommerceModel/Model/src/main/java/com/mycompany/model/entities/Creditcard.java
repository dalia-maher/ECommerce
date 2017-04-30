/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dalia
 */
@Entity
@Table(name = "creditcard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Creditcard.findAll", query = "SELECT c FROM Creditcard c"),
    @NamedQuery(name = "Creditcard.findByCreditCardid", query = "SELECT c FROM Creditcard c WHERE c.creditCardid = :creditCardid"),
    @NamedQuery(name = "Creditcard.findByAmonut", query = "SELECT c FROM Creditcard c WHERE c.amonut = :amonut"),
    @NamedQuery(name = "Creditcard.findByPrinted", query = "SELECT c FROM Creditcard c WHERE c.printed = :printed")})
public class Creditcard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "creditCard_id")
    private Integer creditCardid;
    @Basic(optional = false)
    @Column(name = "amonut")
    private double amonut;
    @Basic(optional = false)
    @Lob
    @Column(name = "number")
    private String number;
    @Column(name = "printed")
    private Boolean printed;

    public Creditcard() {
    }

    public Creditcard(Integer creditCardid) {
        this.creditCardid = creditCardid;
    }

    public Creditcard(Integer creditCardid, double amonut, String number) {
        this.creditCardid = creditCardid;
        this.amonut = amonut;
        this.number = number;
    }

    public Integer getCreditCardid() {
        return creditCardid;
    }

    public void setCreditCardid(Integer creditCardid) {
        this.creditCardid = creditCardid;
    }

    public double getAmonut() {
        return amonut;
    }

    public void setAmonut(double amonut) {
        this.amonut = amonut;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getPrinted() {
        return printed;
    }

    public void setPrinted(Boolean printed) {
        this.printed = printed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (creditCardid != null ? creditCardid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creditcard)) {
            return false;
        }
        Creditcard other = (Creditcard) object;
        if ((this.creditCardid == null && other.creditCardid != null) || (this.creditCardid != null && !this.creditCardid.equals(other.creditCardid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.entities.Creditcard[ creditCardid=" + creditCardid + " ]";
    }
    
}
