/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.service;

import java.sql.SQLException;

/**
 *
 * @author wanderbe
 */
public interface Service {
    Object getById(int id) throws SQLException;
    int save(Object o);
    void update(Object o);
    void remove(Object o);
}
