package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * @author shkstart
 * @create 2020-04-12 17:59
 */
public interface UserService {

    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean regist(User user);

    boolean active(String code);

    User login(User user);
}
