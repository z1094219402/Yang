package com.yang.main.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Component
@Aspect
public class AnoAspcet {

	@Before("execution(public * com.yang.main.controllers.*.*(*))")
	public void doBefore(JoinPoint joinPoint) {
		// + JSON.toJSONString(joinPoint.getArgs())
	    System.out.println("do in Aspect before method called! args: ");
	}
	
	@Pointcut("execution(public * com.yang.main.controllers.*.*(*))")
	public void point() {
	}
	
	@After("point()")
	public void doAfter(JoinPoint joinPoint) {
		// + JSON.toJSONString(joinPoint.getArgs())
	    System.out.println("do in Aspect after method called! args: ");
	}
	
	/**
	 * 执行完毕之后，通过 args指定参数；通过 returning 指定返回的结果，要求返回值类型匹配
	 *
	 * @param time
	 * @param result
	 */
	@AfterReturning(value = "point() && args(time)", returning = "result")
	public void doAfterReturning(long time, String result) {
	    System.out.println("do in Aspect after method return! args: " + time + " ans: " + result);
	}
	
	@Around("point()")
	public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
	    System.out.println("do in Aspect around ------ before");
	    Object ans = joinPoint.proceed();
	    System.out.println("do in Aspect around ------- over! ans: " + ans);
	    return ans;
	}
}
