/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.Cookie;

/**
 *
 * @author wanderbe
 */
public class CookieParserImpl implements CookieParser{

    @Override
    public Map<Integer, Integer> parseToMap(Cookie basket) {
        Map<Integer, Integer> map = new HashMap();
        String[] rawCookieParams = basket.getValue().split(";");
        for(String s:rawCookieParams){
            String[] s1 = s.split("=");
            map.put(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
        }
    return map;
    }
    
        public Map<Integer, Integer> parseToMap(String basket) {
        Map<Integer, Integer> map = new HashMap();
        String[] rawCookieParams = basket.split(";");
        for(String s:rawCookieParams){
            String[] s1 = s.split("=");
            map.put(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
        }
    return map;
    }

    @Override
    public String mapToStringForCookie(Map mapBasket) {
        String string = "";
        Set<Integer> keySet = mapBasket.keySet();
        for (Integer i:keySet){
            string=string+i+"="+mapBasket.get(i)+";";
        }
        return string;
    }

}
