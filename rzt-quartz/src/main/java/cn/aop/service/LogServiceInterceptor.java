package cn.aop.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("logServiceInterceptor")
@Aspect
public class LogServiceInterceptor {

	@ex
	public void aspect(){
		
	}
}
