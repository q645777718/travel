package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Category;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-16 22:00
 */
public interface CategoryDao {

    public List<Category> findAll();
}
