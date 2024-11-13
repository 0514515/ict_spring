package aop1_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

public class LoggingAdvice {
	
	public void before(JoinPoint point) throws Throwable {
		
		String methodName = point.getSignature().getName();
		System.out.println("[*************** 공통관심사 사전작업 >>>>> " + methodName);
	}
	
	
	public void after(JoinPoint point) throws Throwable {
		
		String methodName = point.getSignature().getName();
		System.out.println("[vvvvvvvvvvvvvvv 공통관심사 사후작업 >>>>> " + methodName);
	}
	
//	public Object around(ProceedingJoinPoint point) throws Throwable{
//		String methodName = point.getSignature().getName();
//		System.out.println("[bbbbbbbbbbbbbbb 공통관심사 사전작업 >>>>> " + methodName);
//		Object obj = point.proceed();
//		System.out.println("[aaaaaaaaaaaaaaa 공통관심사 사후작업 >>>>> " + methodName);
//		return obj;
//	}
}
