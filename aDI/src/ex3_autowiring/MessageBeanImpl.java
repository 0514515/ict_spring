package ex3_autowiring;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageBeanImpl implements MessageBean {

	private String name = "박도훈";
	private String message = "빼빼로 주세요";

	@Autowired
	@Qualifier("outputer2")
	private Outputer out;

	@Override
	public void sayHello() {
		System.out.println(name + message);

		try {
			out.writeMessage(name+message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
