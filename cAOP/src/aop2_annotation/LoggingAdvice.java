package aop2_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAdvice {
	

	@Before("execution(public * aop2_annotation.*.*Hello(..))")
	public void before(JoinPoint point) throws Throwable {
		
		String methodName = point.getSignature().getName();
		System.out.println("[originaloriginaloriginal 공통관심사 사전작업 >>>>> " + methodName);
	}
	
	@After("execution(public * aop2_annotation.*.*Hello(..))")
	public void after(JoinPoint point) throws Throwable {
		
		String methodName = point.getSignature().getName();
		System.out.println("[vvvvvvvvvvvvvvv 공통관심사 사후작업 >>>>> " + methodName);
	}
	
	public Object around(ProceedingJoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[bbbbbbbbbbbbbbb 공통관심사 사전작업 >>>>> " + methodName);
		Object obj = point.proceed();
		System.out.println("[aaaaaaaaaaaaaaa 공통관심사 사후작업 >>>>> " + methodName);
		return obj;
	}
}
