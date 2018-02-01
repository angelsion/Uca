/**  
 * @Title: TokenManager.java
 * @Package org.csun.nc.utils
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2017年9月11日
 */
package com.uca.service;


import com.uca.entity.TokenModel;

/**
 * ClassName: TokenManager 
 * @Description: 对token进行操作的接口
 * @author puyijun
 * @date 2018-01-15
 */
public interface TokenManager {

	/**
     * 创建一个token关联上指定用户
     * @param userId 指定用户的id
     * @return 生成的token
     */
    public TokenModel createToken(long userId);

    /**
     * 检查token是否有效
     * @param model token
     * @return 是否有效
     */
    public boolean checkToken(TokenModel model);

    /**
     * 从字符串中解析token
     * @param authentication 加密后的字符串
     * @return
     */
    public TokenModel getToken(String authentication);

    /**
     * 清除token
     * @param userId 登录用户的id
     */
    public void deleteToken(long userId);
    
    /**
     * 非单点登录-通过userId获取token
     */
    public TokenModel get(long userId);
	
}
