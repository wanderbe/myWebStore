/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wanderbe
 */
@Entity
@Table(name = "items_in_orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemsInOrders.findAll", query = "SELECT i FROM ItemsInOrders i"),
    @NamedQuery(name = "ItemsInOrders.findByIdProductInOrder", query = "SELECT i FROM ItemsInOrders i WHERE i.idProductInOrder = :idProductInOrder"),
    @NamedQuery(name = "ItemsInOrders.findByIdProduct", query = "SELECT i FROM ItemsInOrders i WHERE i.idProduct = :idProduct"),
    @NamedQuery(name = "ItemsInOrders.findByAmount", query = "SELECT i FROM ItemsInOrders i WHERE i.amount = :amount")})
public class ItemsInOrders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_product_in_order")
    private Integer idProductInOrder;
    @Basic(optional = false)
    @Column(name = "id_product")
    private int idProduct;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    @JoinColumn(name = "id_order", referencedColumnName = "id_order")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Orders idOrder;

    public ItemsInOrders() {
    }

    public ItemsInOrders(Integer idProductInOrder) {
        this.idProductInOrder = idProductInOrder;
    }

    public ItemsInOrders(Integer idProductInOrder, int idProduct, int amount) {
        this.idProductInOrder = idProductInOrder;
        this.idProduct = idProduct;
        this.amount = amount;
    }

    public Integer getIdProductInOrder() {
        return idProductInOrder;
    }

    public void setIdProductInOrder(Integer idProductInOrder) {
        this.idProductInOrder = idProductInOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Orders getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Orders idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductInOrder != null ? idProductInOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemsInOrders)) {
            return false;
        }
        ItemsInOrders other = (ItemsInOrders) object;
        if ((this.idProductInOrder == null && other.idProductInOrder != null) || (this.idProductInOrder != null && !this.idProductInOrder.equals(other.idProductInOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemsInOrders{" + "idProductInOrder=" + idProductInOrder + ", idProduct=" + idProduct + ", amount=" + amount + ", idOrder=" + idOrder + '}';
    }


    
}
