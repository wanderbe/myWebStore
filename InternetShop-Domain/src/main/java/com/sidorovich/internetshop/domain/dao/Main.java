/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.dao;

import com.sidorovich.internetshop.domain.entity.GroupOfProduct;
import com.sidorovich.internetshop.domain.entity.Products;
import com.sidorovich.internetshop.domain.entity.Users;
import java.util.List;

/**
 *
 * @author wanderbe
 */
public class Main {
    public static void main(String[] args) {
        UsersDao usersDao = new UsersDaoImpl();
        List<Users> uL = usersDao.getUsersList();
        for(Users u: uL){
            System.out.println(u);
        }
        GroupOfProductDao productsDao = new GroupOfProductDaoImpl();
        List<GroupOfProduct> pL = productsDao.getGroupOfProductList();
        for(GroupOfProduct p: pL){
            System.out.println(p);
        }
    }
    
}
