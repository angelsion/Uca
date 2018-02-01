package com.uca.service.impl;

import com.uca.dao.UserMapper;
import com.uca.entity.User;
import com.uca.exception.ArgsIsBlankException;
import com.uca.exception.ArgsPassException;
import com.uca.service.UserService;
import com.uca.utils.MD5;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author puyijun
 * @ClassName UserServiceImpl
 * @date 2018-01-12
 * @time 14:45
 * @Description
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User findUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public User findUserByAccount(String account) {
        return userMapper.selectBySysUserAccount(account);
    }

    @Override
    public User login(String username, String password, String openId) throws Exception {
        if(username == null || password == null){
            throw new ArgsPassException("参数传递异常");
        }

        if(StringUtils.isBlank(username)){
            throw new ArgsIsBlankException("请输入用户名！");
        }

        if(StringUtils.isBlank(password)){
            throw new ArgsIsBlankException("请输入密码！");
        }

        User user = userMapper.selectByUsername(username);

        if(user== null){
            throw new RuntimeException("用户名不存在");
        }

        //密码加密
        password = MD5.getMd5().getMD5ofStr(password);

        if(!password.equals(user.getPassword())){
            throw new RuntimeException("用户名或者密码错误");
        }

        return user;
    }
}
