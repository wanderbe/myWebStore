/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.service;

import java.util.Map;
import javax.servlet.http.Cookie;

/**
 *
 * @author wanderbe
 */
public interface CookieParser {
    Map<Integer, Integer> parseToMap(Cookie basket);
    String mapToStringForCookie(Map mapBasket);
}
