import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import entity.Member;
import service.MemberService;

public class CreateMain {
	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		Member member = new Member();
		member.setUserid("id1");
		member.setUserpass("1234");
		member.setUsername("name1");
		
		MemberService memberService = container.getBean("memberServiceImpl",MemberService.class);
		memberService.createMember(member);
		
		List<Member> memberList = memberService.getAllMemberList();
		for(Member m : memberList) {
			System.out.println(m.toString());
		}
	}
}
