package ex1_xml2_ref;

import org.springframework.stereotype.Component;


public class MemberDAO {
	
	private MemberBean member;
	
	public MemberDAO() {
		
	}
	
	public MemberDAO(MemberBean member) {
		this.member = member;
	}
	
	//setter
	public void setMember(MemberBean member) {
		this.member = member;
	}
	
	public void insert() {
		System.out.println(member.toString());
		System.out.println("입력되었습니다.");
	}

}
