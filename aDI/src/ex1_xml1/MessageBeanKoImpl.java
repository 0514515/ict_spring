package ex1_xml1;

public class MessageBeanKoImpl implements MessageBean{

	public MessageBeanKoImpl() {
		System.out.println("koimpl");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요" + name + "님");
		
	}
	
}
