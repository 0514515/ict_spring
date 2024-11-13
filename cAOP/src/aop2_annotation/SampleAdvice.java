package aop2_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class SampleAdvice {
	
	
	@Before("execution(public * aop2_annotation.*.*Hello(..))")
	public void before(JoinPoint point) throws Throwable {
		
		String methodName = point.getSignature().getName();
		System.out.println("[samplesamplesample 공통관심사 사전작업 >>>>> " + methodName);
	}
}
