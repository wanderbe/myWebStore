/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.domain.dao;

import com.sidorovich.internetshop.domain.entity.Orders;
import java.util.List;

/**
 *
 * @author wanderbe
 */
public interface OrdersDao extends Dao{
    List<Orders> getOrdersList();
}
