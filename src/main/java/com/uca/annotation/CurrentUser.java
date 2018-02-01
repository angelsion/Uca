/**  
 * @Title: CurrentUser.java
 * @Package org.csun.nc.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2017年9月12日
 */
package com.uca.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: CurrentUser 
 * @Description: 在Controller的方法参数中使用此注解，该方法在映射时会注入当前登录的User对象
 * @author puyijun
 * @date 2018-01-15
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface CurrentUser {
}
