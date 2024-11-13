import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import entity.Member;
import service.MemberService;

public class DeleteMain {

	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		MemberService memberService = container.getBean("memberServiceImpl",MemberService.class);
		
		Member member = new Member();
		member.setUserid("id1");
		member.setUserpass("1234");
		member.setUsername("name9");
		
		memberService.deleteMemberByIdAndPassword(member);
		
		List<Member> memberList = memberService.getAllMemberList();
		for(Member m : memberList) {
			System.out.println(m.toString());
		}
	}

}
