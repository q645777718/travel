package cn.itcast.travel.dao;

import cn.itcast.travel.domain.RouteImg;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-17 23:09
 */
public interface RouteImgDao {



    List<RouteImg> findByRid(int rid);
}
