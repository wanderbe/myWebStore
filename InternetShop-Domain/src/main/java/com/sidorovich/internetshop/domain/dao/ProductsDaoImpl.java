
package com.sidorovich.internetshop.domain.dao;

import com.sidorovich.internetshop.domain.entity.GroupOfProduct;
import com.sidorovich.internetshop.domain.entity.Products;
import com.sidorovich.internetshop.domain.main.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ProductsDaoImpl extends DaoSceleton implements ProductsDao{

    @Override
    public List<Products> getProductsList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Products.class); 
        List<Products> pList = (List<Products>)crit.list();
        session.close();
        return pList;
    }

    @Override
    public Products getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Products.class)
                .add(Restrictions.eq("id", id));
        Products p = (Products)crit.uniqueResult();
        session.close();
        return p;
    } 

    @Override
    public List<Products> getByGroupOfProducts(GroupOfProduct productGroup) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Products.class)
                .add(Restrictions.eq("productGroup", productGroup));
        List<Products> pL = crit.list();
        session.close();
        return pL;
    } 
}
