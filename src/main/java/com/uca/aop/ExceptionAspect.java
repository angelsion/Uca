package com.uca.aop;

import com.uca.common.web.JsonResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author puyijun
 * @date 2018-01-10
 * @desc 异常处理切面
 */
@Aspect
@Component
public class ExceptionAspect {
	@Around("within(com.uca.controller.*Controller)")
	public Object process(ProceedingJoinPoint target) {
		
		try{
			Object o = target.proceed();
			return o;
		} catch(Throwable e){
			System.out.println("runtime:");
			e.printStackTrace();
			return new JsonResult(e);
		}
	}
}
