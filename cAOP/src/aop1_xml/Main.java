package aop1_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ctx.xml");
		
		MessageBean messageBean = context.getBean("targetBean",MessageBeanImpl.class);
		messageBean.sayHello();
		System.out.println("----------------------");
		messageBean.engSayHello();
		System.out.println("----------------------");
		messageBean.test();
	}
}