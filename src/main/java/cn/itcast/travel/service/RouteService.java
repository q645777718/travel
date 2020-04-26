package cn.itcast.travel.service;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;

/**
 * @author shkstart
 * @create 2020-04-17 16:58
 */
public interface RouteService {

    PageBean<Route> pageQuery(int cid, int currentPage, int pageSize,String rname );

    Route findOne(String rid);
}
