
package com.sidorovich.internetshop.domain.dao;

import com.sidorovich.internetshop.domain.entity.GroupOfProduct;
import com.sidorovich.internetshop.domain.entity.Products;
import com.sidorovich.internetshop.domain.main.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class GroupOfProductDaoImpl extends DaoSceleton implements GroupOfProductDao{

    @Override
    public List<GroupOfProduct> getGroupOfProductList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(GroupOfProduct.class); 
        List<GroupOfProduct> gpList = (List<GroupOfProduct>)crit.list();
        session.close();
        return gpList;
    }

    @Override
    public GroupOfProduct getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(GroupOfProduct.class)
                .add(Restrictions.eq("id", id));
        GroupOfProduct gp = (GroupOfProduct)crit.uniqueResult();
        session.close();
        return gp;
    } 


}
