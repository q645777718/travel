package cn.itcast.travel.service;

/**
 * @author shkstart
 * @create 2020-04-18 0:03
 */
public interface FavoriteService {

    boolean isFavorite(String rid,int uid);

    void add(String rid, int uid);
}
