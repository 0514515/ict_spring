package aop1_xml;

import org.springframework.stereotype.Component;


public class MessageBeanImpl implements MessageBean{

	@Override
	public void sayHello() {
		System.out.println("안녕하세요");
	}

	@Override
	public void engSayHello() {
		System.out.println("hello");
	}

	@Override
	public void test() {
		System.out.println("테스트 test");
	}
}
