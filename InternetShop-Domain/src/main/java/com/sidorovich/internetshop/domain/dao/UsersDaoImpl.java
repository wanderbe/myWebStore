/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.dao;

import com.sidorovich.internetshop.domain.entity.Users;
import com.sidorovich.internetshop.domain.main.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author wanderbe
 */
public class UsersDaoImpl extends DaoSceleton implements UsersDao{
        @Override
    public List<Users> getUsersList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Users.class); 
        List<Users> uList = (List<Users>)crit.list();
        session.close();
        return uList;
    }

    @Override
    public Users getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Users.class)
                .add(Restrictions.eq("id", id));
        Users u = (Users)crit.uniqueResult();
        session.close();
        return u;
    } 
    
}
