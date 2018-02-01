package com.uca.dao;

import com.uca.entity.User;

/**
 * @author
 * @ClassName UserMapper
 * @date 2018-01-12
 * @time 14:54
 * @Description
 **/

public interface UserMapper {

    User selectByPrimaryKey(Long userId);

    User selectBySysUserAccount(String account);

    User selectByUsername(String username);
}
