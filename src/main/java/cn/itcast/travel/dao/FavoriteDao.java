package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

/**
 * @author shkstart
 * @create 2020-04-17 23:59
 */
public interface FavoriteDao {

    Favorite findByRidAndUid(int  rid, int  uid);

    int findCountByRid(int rid);

    void add(int rid,int uid);
}
