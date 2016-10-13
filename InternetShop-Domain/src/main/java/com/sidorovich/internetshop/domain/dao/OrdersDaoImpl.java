/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.dao;

import com.sidorovich.internetshop.domain.entity.Orders;
import com.sidorovich.internetshop.domain.main.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author wanderbe
 */
public class OrdersDaoImpl extends DaoSceleton implements OrdersDao{
    
    @Override
    public List<Orders> getOrdersList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Orders.class); 
        List<Orders> pList = (List<Orders>)crit.list();
        session.close();
        return pList;
    }

    @Override
    public Orders getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Orders.class)
                .add(Restrictions.eq("id", id));
        Orders o = (Orders)crit.uniqueResult();
        session.close();
        return o;
    }
}
