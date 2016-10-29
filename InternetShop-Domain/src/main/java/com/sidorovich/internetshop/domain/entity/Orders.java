/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wanderbe
 */
@Entity
@Table(name = "orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByIdOrder", query = "SELECT o FROM Orders o WHERE o.idOrder = :idOrder"),
    @NamedQuery(name = "Orders.findByDateStart", query = "SELECT o FROM Orders o WHERE o.dateStart = :dateStart"),
    @NamedQuery(name = "Orders.findByDateFinish", query = "SELECT o FROM Orders o WHERE o.dateFinish = :dateFinish"),
    @NamedQuery(name = "Orders.findByState", query = "SELECT o FROM Orders o WHERE o.state = :state"),
    @NamedQuery(name = "Orders.findByNote", query = "SELECT o FROM Orders o WHERE o.note = :note")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order")
    private Integer idOrder;
    @Basic(optional = false)
    @Column(name = "date_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;
    @Column(name = "date_finish")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFinish;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Column(name = "note")
    private String note;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrder")
    private List<ItemsInOrders> itemsInOrdersList;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users idUser;

    public Orders() {
    }

    public Orders(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Orders(Integer idOrder, Date dateStart, String state) {
        this.idOrder = idOrder;
        this.dateStart = dateStart;
        this.state = state;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlTransient
    public List<ItemsInOrders> getItemsInOrdersList() {
        return itemsInOrdersList;
    }

    public void setItemsInOrdersList(List<ItemsInOrders> itemsInOrdersList) {
        this.itemsInOrdersList = itemsInOrdersList;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sidorovich.internetshop.domain.entity.Orders[ idOrder=" + idOrder + " ]";
    }
    
}
