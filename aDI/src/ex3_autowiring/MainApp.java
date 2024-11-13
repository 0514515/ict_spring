package ex3_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex3_autowiring/beans.xml");
		
		MessageBean bean = context.getBean("messageBeanImpl",MessageBeanImpl.class);
		bean.sayHello();
	}
}
