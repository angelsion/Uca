package com.uca.service;

import com.uca.entity.User;

/**
 * @author
 * @ClassName UserService
 * @date 2018-01-12
 * @time 14:45
 * @Description
 **/

public interface UserService {

    User findUserById(Long userId);

    User findUserByAccount(String account);

    //用户登录
    User login(String username, String password,String openId) throws Exception;
}
