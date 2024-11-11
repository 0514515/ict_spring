package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class MemberDAO {
	
	@Autowired
	private MemberBean member;
	
	public void insert() {
		System.out.println(member.toString());
		System.out.println("입력되었습니다.");
	}

}
