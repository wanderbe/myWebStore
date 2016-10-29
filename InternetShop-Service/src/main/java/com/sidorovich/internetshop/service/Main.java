/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.service;

import com.sidorovich.internetshop.domain.entity.GroupOfProduct;
import com.sidorovich.internetshop.domain.entity.Products;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author wanderbe
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        CookieParserImpl cookieParser = new CookieParserImpl();
        Map<Integer, Integer> map = new HashMap();
        
        
        
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 1);
        map1.put(2, 1);
        
        System.out.println(cookieParser.mapToStringForCookie(map1));
    }
    
}
