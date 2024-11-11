package ex3_autowiring;

import org.springframework.stereotype.Component;

@Component("message")
public class MessageBeanImpl implements MessageBean{

	private String name = "박도훈";
	private String message = "빼빼로 주세요";
	
	@Override
	public void sayHello() {
		System.out.println(name + message);
		
	}

}
