package ex1_xml3_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml3_list/applicationContext.xml");
		
		ListBean bean = context.getBean("listBean", ListBean.class);
		
		for(Integer i : bean.getIntList()) {
			System.out.println(i);
		}
		
		for(MemberBean member : bean.getMemberList()) {
			System.out.println(member.toString());
		}
	}

}
