/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.service;

import com.sidorovich.internetshop.domain.dao.ProductsDao;
import com.sidorovich.internetshop.domain.dao.ProductsDaoImpl;
import com.sidorovich.internetshop.domain.entity.Products;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author wanderbe
 */
public class ProductsServiceImpl implements ProductsService {

    @Override
    public List<Products> getProductsList() throws SQLException{
        List<Products> pL = null;
        try{
            ProductsDao productsDao = new ProductsDaoImpl();
            pL = productsDao.getProductsList();
            return pL;
        }catch(Exception e){
            throw new SQLException("List of products not founded");
        }
    }

    @Override
    public Object getById(int id) throws SQLException{
    Products p = null;
        try{
            ProductsDao productsDao = new ProductsDaoImpl();
            p = (Products)productsDao.getById(id);
            return p;
        }catch(Exception e){
            throw new SQLException("Product not founded");
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

    @Override
    public List<Products> getProductsByGroupIdList(int idgroup) throws SQLException {
        List<Products> pL = null;
        try{
            ProductsDao productsDao = new ProductsDaoImpl();
            pL = productsDao.getProductsByGroupIdList(idgroup);
            return pL;
        }catch(Exception e){
            throw new SQLException("List of products not founded");
        }
    }
    
}
