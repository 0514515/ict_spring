package ex2_annotation;

import org.springframework.stereotype.Component;

@Component
public class MemberBean {
	private String name = "이름";
	private Long age = (long)3;
	private String message = "메시지";
	
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", age=" + age + ", message=" + message + "]";
	}
	
//	public MemberBean() {
//		super();
//		System.out.println("default constructor");
//	}
//	public MemberBean(String name, Long age, String message) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.message = message;
//		System.out.println("used field constructor");
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setAge(Long age) {
//		this.age = age;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
	

	
	
	
	
}
