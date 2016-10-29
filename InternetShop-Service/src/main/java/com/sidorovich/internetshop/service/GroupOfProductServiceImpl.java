/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.service;

import com.sidorovich.internetshop.domain.dao.GroupOfProductDao;
import com.sidorovich.internetshop.domain.dao.GroupOfProductDaoImpl;
import com.sidorovich.internetshop.domain.dao.ProductsDao;
import com.sidorovich.internetshop.domain.dao.ProductsDaoImpl;
import com.sidorovich.internetshop.domain.entity.GroupOfProduct;
import com.sidorovich.internetshop.domain.entity.Products;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author wanderbe
 */
public class GroupOfProductServiceImpl implements GroupOfProductService {

    @Override
    public List<GroupOfProduct> getGroupOfProductList() throws SQLException{
        List<GroupOfProduct> groupOfProducts = null;
        try{
            GroupOfProductDao groupOfProductDao = new GroupOfProductDaoImpl();
            groupOfProducts = groupOfProductDao.getGroupOfProductList();
            return groupOfProducts;
        }catch(Exception e){
            throw new SQLException("List of products not founded");
        }
    }

    @Override
    public Object getById(int id) throws SQLException {
            GroupOfProduct groupOfProduct = null;
        try{
            GroupOfProductDao groupOfProductDao = new GroupOfProductDaoImpl();
            groupOfProduct = (GroupOfProduct)groupOfProductDao.getById(id);
            return groupOfProduct;
        }catch(Exception e){
            throw new SQLException("List of products not founded");
        }
    }

    @Override
    public int save(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
