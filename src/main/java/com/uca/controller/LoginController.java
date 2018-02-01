package com.uca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/")
public class LoginController {

	/**
	 * 用户登录页面
	 */
	@RequestMapping(value="login", method= RequestMethod.GET)
	public String tologin(HttpServletRequest request){
		return "login";
	}
	
	/**
	 * 用户登录验证
	 */
	@RequestMapping(value="login", method= RequestMethod.POST)
	public String login(HttpServletRequest request){
		request.setAttribute("message_login", "success");
		String resultPageURL="turnToMain";
		return resultPageURL;
	}
	
	
	/**
	 * 用户登出
	 */
	/*@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		 SecurityUtils.getSubject().logout();
		 return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/";
	}*/
	
	/**
	 * 跳转页面
	 */
	@RequestMapping("/turnToMain")
	public String turnToMain(HttpServletRequest request){
		return "turnToMain";
	}
	

}