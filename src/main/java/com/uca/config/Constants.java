/**  
 * @Title: Constants.java
 * @Package org.csun.nc.config
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2017年9月12日
 */
package com.uca.config;

/**
 * ClassName: Constants 
 * @Description: 存放静态变量
 * @author puyijun
 * @date 2018-01-15
 */
public class Constants {

    /**
     * 存储当前登录用户id的字段名
     */
    public static final String CURRENT_USER_ID = "CURRENT_USER_ID";

    /**
     * token有效期（小时）
     */
    public static final int TOKEN_EXPIRES_HOUR = 72;

    /**
     * 存放Authorization的header字段
     */
    public static final String AUTHORIZATION = "authorization";
    
    /**
     * 短信验证业务-用户注册
     */
    public static final int PHONE_REGISTER = 1;
    
    /**
     * 短信验证码业务-修改密码
     */
    public static final int PHONE_RESTPWD = 2;
    
    /**
     * 短信验证码业务-修改手机号
     */
    public static final int PHONE_MODIFY = 3;
    
    /**
     * 短信验证码业务-修改手机号-新号码确认
     */
    public static final int PHONE_MODIFY_CHECK = 4;
    
    /**
     * 短信验证码工单时效 1天
     */
    public static final long PHONE_EXPIRE = (24 * 60 * 60);
    
    /**
     * 终端类型 - web
     */
    public static final int CLIENT_WEB = 1;
    
    /**
     * 终端类型 - app
     */
    public static final int CLIENT_APP = 2;

    /**
     * 用户角色 - code - 管理员
     */
    public static final String ADMIN_CODE = "admin";
    
}
