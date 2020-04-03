package com.example.demo.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component //객체 자동으로 스캔해줘
public class BitAdvice {

	@Pointcut("execution(public * com.example.demo.controller..*(..))")
	public void cmethod() {}
	
	@Before("cmethod()")
	public void before() {
		System.out.println("컨트롤러 동작하기 전 입니다.");
	}
}
