/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.dao;

import com.sidorovich.internetshop.domain.entity.GroupOfProduct;
import com.sidorovich.internetshop.domain.entity.Products;
import java.util.List;

/**
 *
 * @author wanderbe
 */
public interface ProductsDao extends Dao{
    List<Products> getProductsList();
    public List<Products> getByGroupOfProducts(GroupOfProduct productGroup);
}
