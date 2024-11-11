package ex1_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// 기존 자바 방식
		MessageBean bean = new MessageBeanKoImpl();
		bean.sayHello("호길동");
		
		MessageBean bean2 = new MessageBeanEnImpl();
		bean2.sayHello("egrk");
		
		// 스프링 방식
		// 1. 스프링 설정파일 연결 (추후에 자동화)
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml1/applicationContext.xml");
		// 2. DI : 스프링 컨테이너 속 빈 가져오기
		MessageBean bean3 = (MessageBean) context.getBean("en");
		bean3.sayHello("esartdyu");
		
		MessageBean bean4 = context.getBean("kor",MessageBean.class);
		bean4.sayHello("8765432");
	}
}
