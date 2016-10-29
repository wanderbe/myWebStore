/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "group_of_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupOfProduct.findAll", query = "SELECT g FROM GroupOfProduct g"),
    @NamedQuery(name = "GroupOfProduct.findByIdProductGroup", query = "SELECT g FROM GroupOfProduct g WHERE g.idProductGroup = :idProductGroup"),
    @NamedQuery(name = "GroupOfProduct.findByNameProductGroup", query = "SELECT g FROM GroupOfProduct g WHERE g.nameProductGroup = :nameProductGroup"),
    @NamedQuery(name = "GroupOfProduct.findByDiscriptionProductGroup", query = "SELECT g FROM GroupOfProduct g WHERE g.discriptionProductGroup = :discriptionProductGroup"),
    @NamedQuery(name = "GroupOfProduct.findByImage", query = "SELECT g FROM GroupOfProduct g WHERE g.image = :image")})
public class GroupOfProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_product_group")
    private Integer idProductGroup;
    @Basic(optional = false)
    @Column(name = "name_product_group")
    private String nameProductGroup;
    @Basic(optional = false)
    @Column(name = "discription_product_group")
    private String discriptionProductGroup;
    @Column(name = "image")
    private String image;
    @OneToMany(mappedBy = "productGroup")
    private List<Products> productsList;

    public GroupOfProduct() {
    }

    public GroupOfProduct(Integer idProductGroup) {
        this.idProductGroup = idProductGroup;
    }

    public GroupOfProduct(Integer idProductGroup, String nameProductGroup, String discriptionProductGroup) {
        this.idProductGroup = idProductGroup;
        this.nameProductGroup = nameProductGroup;
        this.discriptionProductGroup = discriptionProductGroup;
    }

    public Integer getIdProductGroup() {
        return idProductGroup;
    }

    public void setIdProductGroup(Integer idProductGroup) {
        this.idProductGroup = idProductGroup;
    }

    public String getNameProductGroup() {
        return nameProductGroup;
    }

    public void setNameProductGroup(String nameProductGroup) {
        this.nameProductGroup = nameProductGroup;
    }

    public String getDiscriptionProductGroup() {
        return discriptionProductGroup;
    }

    public void setDiscriptionProductGroup(String discriptionProductGroup) {
        this.discriptionProductGroup = discriptionProductGroup;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @XmlTransient
    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductGroup != null ? idProductGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupOfProduct)) {
            return false;
        }
        GroupOfProduct other = (GroupOfProduct) object;
        if ((this.idProductGroup == null && other.idProductGroup != null) || (this.idProductGroup != null && !this.idProductGroup.equals(other.idProductGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sidorovich.internetshop.domain.entity.GroupOfProduct[ idProductGroup=" + idProductGroup + " ]";
    }
    
}
