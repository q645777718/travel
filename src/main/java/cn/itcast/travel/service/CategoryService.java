package cn.itcast.travel.service;

import cn.itcast.travel.domain.Category;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-16 22:10
 */
public interface CategoryService {

    public List<Category> findAll();
}
