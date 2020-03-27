package com.example.demo.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BitAdvice {
	
	@Pointcut("execution(public * com.example.demo.controller..*(..))")
	public void cmethod() {}
	
	@Before("cmethod()")
	public void before() {
		System.out.println("컨틀롤러 동작하기 전입니다");
	}
}










