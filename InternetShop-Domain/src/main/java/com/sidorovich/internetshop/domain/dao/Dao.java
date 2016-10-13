
package com.sidorovich.internetshop.domain.dao;

import java.util.List;

public interface Dao {
    Object getById(int id);
    int save(Object o);
    void update(Object o);
    void remove(Object o);
}
