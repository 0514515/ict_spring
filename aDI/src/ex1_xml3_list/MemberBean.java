package ex1_xml3_list;

public class MemberBean {
	private String name;
	private Long age;
	private String message;
	
	
	
	public MemberBean() {
		super();
		System.out.println("default constructor");
	}
	public MemberBean(String name, Long age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
		System.out.println("used field constructor");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", age=" + age + ", message=" + message + "]";
	}
	
	
	
	
}
