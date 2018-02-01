/**  
 * @Title: ApplicationContextUtil.java
 * @Package org.csun.bt.utils
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2017年12月1日
 */
package com.uca.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ClassName: ApplicationContextUtil 
 * @Description: 注解加载工具类
 * @author puyijun
 * @date 2018.01.20
 */
public class ApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		ApplicationContextUtil.applicationContext = applicationContext;
	}

	/**
	 * @Description: 根据名称查询Bean对象
	 */
	public static Object getBean(String name) {
		return applicationContext.getBean(name);
	}
	
	/**
	 * @Description: 通过类类型加载Bean实体
	 */
	@SuppressWarnings("unchecked")
	public static Object getBeanByClass(Class c) {
		return applicationContext.getBean(c);
	}
	
}
