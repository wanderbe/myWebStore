/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wanderbe
 */
@Entity
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByIdProduct", query = "SELECT p FROM Products p WHERE p.idProduct = :idProduct"),
    @NamedQuery(name = "Products.findByName", query = "SELECT p FROM Products p WHERE p.name = :name"),
    @NamedQuery(name = "Products.findByImage", query = "SELECT p FROM Products p WHERE p.image = :image"),
    @NamedQuery(name = "Products.findByStock", query = "SELECT p FROM Products p WHERE p.stock = :stock"),
    @NamedQuery(name = "Products.findByIdPrice", query = "SELECT p FROM Products p WHERE p.idPrice = :idPrice")})
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_product")
    private Integer idProduct;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "discription_product")
    private String discriptionProduct;
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @Column(name = "stock")
    private int stock;
    @Basic(optional = false)
    @Column(name = "id_price")
    private int idPrice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduct")
    private List<ItemsInOrders> itemsInOrdersList;
    @JoinColumn(name = "id_productGroup", referencedColumnName = "id_product_group")
    @ManyToOne
    private GroupOfProduct productGroup;

    public Products() {
    }

    public Products(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Products(Integer idProduct, String name, int stock, int idPrice) {
        this.idProduct = idProduct;
        this.name = name;
        this.stock = stock;
        this.idPrice = idPrice;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscriptionProduct() {
        return discriptionProduct;
    }

    public void setDiscriptionProduct(String discriptionProduct) {
        this.discriptionProduct = discriptionProduct;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(int idPrice) {
        this.idPrice = idPrice;
    }

    @XmlTransient
    public List<ItemsInOrders> getItemsInOrdersList() {
        return itemsInOrdersList;
    }

    public void setItemsInOrdersList(List<ItemsInOrders> itemsInOrdersList) {
        this.itemsInOrdersList = itemsInOrdersList;
    }

    public GroupOfProduct getProductGroup() {
        return productGroup;
    }

    public void setIdproductGroup(GroupOfProduct productGroup) {
        this.productGroup = productGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduct != null ? idProduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sidorovich.internetshop.domain.entity.Products[ idProduct=" + idProduct + " ]";
    }
    
}
