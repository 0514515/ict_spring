package aop2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2_annotation/ctx.xml");
		
		MessageBean messageBean = context.getBean("targetBean",MessageBeanImpl.class);
		messageBean.sayHello();
		System.out.println("----------------------");
		messageBean.engSayHello();
		System.out.println("----------------------");
		messageBean.test();
	}
}