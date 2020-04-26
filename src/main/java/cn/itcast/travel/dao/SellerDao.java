package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Seller;

/**
 * @author shkstart
 * @create 2020-04-17 23:09
 */
public interface SellerDao {

    Seller findById(int id);
}
