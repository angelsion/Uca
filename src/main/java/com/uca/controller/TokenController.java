/**  
 * @Title: TokenController.java
 * @Package org.csun.nc.controller
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2017年9月13日
 */
package com.uca.controller;


import com.uca.annotation.Authorization;
import com.uca.annotation.CurrentUser;
import com.uca.common.web.JsonResult;
import com.uca.entity.TokenModel;
import com.uca.entity.User;
import com.uca.service.TokenManager;
import com.uca.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: TokenController 
 * @Description: 令牌拦截器
 * @author puyijun
 * @date 2018-01-15
 */
@RestController
@CrossOrigin
@RequestMapping("/token")
public class TokenController {

	@Resource
	private UserService userService;
	
	@Resource
    private TokenManager tokenManager;

	
	/**
	 * 登录
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public JsonResult login(@RequestParam String username,
							@RequestParam String password, String openId) throws Throwable {
        System.out.println("controller:"+openId);
        User user =  userService.login(username,password,openId);
		
		//生成一个token，保存用户登录状态
		TokenModel model = tokenManager.get(user.getUserId());
		if (model == null) {
			model = tokenManager.createToken(user.getUserId());
		}
		return  new JsonResult(true, "登录成功", model);
			
	}
	
	/**
	 * 注销
	 */
	@RequestMapping(method = RequestMethod.DELETE)
    @Authorization
    public JsonResult logout(@CurrentUser User user) {

        tokenManager.deleteToken(user.getUserId());
		
        return  new JsonResult(true, "退出成功", "");
    }

}
