package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		
//		MemberBean bean = context.getBean("member",MemberBean.class);
//		System.out.println(bean.toString());
//		
//		MemberBean bean2 = context.getBean("member2", MemberBean.class);
//		System.out.println(bean2.toString());
		
		MemberDAO dao = context.getBean("dao",MemberDAO.class);
		dao.insert();
		
		MemberDAO dao2 = context.getBean("dao2",MemberDAO.class);
		dao2.insert();
	}
}
