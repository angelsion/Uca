/**  
 * @Title: RedisTokenManager.java
 * @Package org.csun.nc.utils
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2017年9月11日
 */
package com.uca.service.impl;

import com.uca.config.Constants;
import com.uca.entity.TokenModel;
import com.uca.service.TokenManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: RedisTokenManager 
 * @Description: 通过Redis存储和验证token的实现类
 * @author puyijun
 * @date 2018-01-15
 */
@Service
public class RedisTokenManager implements TokenManager {

    @Resource(name = "redisTemplate")
    private RedisTemplate<String, String> redis;

    public RedisTokenManager(){}

    public RedisTokenManager(RedisTemplate<String, String> redis) {
        this.redis = redis;
        redis.setKeySerializer(new JdkSerializationRedisSerializer());
    }

    public TokenModel createToken(long userId) {
        //使用uuid作为源token
        String token = UUID.randomUUID().toString().replace("-", "");
        TokenModel model = new TokenModel(userId, token);
        //存储到redis并设置过期时间
        redis.boundValueOps(String.valueOf(userId)).set(token, Constants.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return model;
    }

    public boolean checkToken(TokenModel model) {
        if (model == null) {
            return false;
        }
        String token = redis.boundValueOps(String.valueOf(model.getUserId())).get();
        if (token == null || !token.equals(model.getToken())) {
            return false;
        }
        //如果验证成功，说明此用户进行了一次有效操作，延长token的过期时间
        redis.boundValueOps(String.valueOf(model.getUserId())).expire(Constants.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return true;
    }

    /**
     * 非单点登录-通过userId获取token
     */
    public TokenModel get(long userId) {
    	ValueOperations<String, String> value = redis.opsForValue();
    	String token = value.get(String.valueOf(userId));
    	if (token == null) {
    		return null;
    	}
    	TokenModel model = new TokenModel(userId, token);
    	return model;
    }
    
    public TokenModel getToken(String authentication) {
        if (authentication == null || authentication.length() == 0) {
            return null;
        }
        String[] param = authentication.split("_");
        if (param.length != 2) {
            return null;
        }
        //使用userId和源token简单拼接成的token，可以增加加密措施
        long userId = Long.parseLong(param[0]);
        String token = param[1];
        return new TokenModel(userId, token);
    }

    public void deleteToken(long userId) {
        redis.delete(String.valueOf(userId));
    }
}
