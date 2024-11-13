package service;

import java.util.List;

import entity.Member;

public interface MemberService {

	public void createMember(Member member); 
	public List<Member> getAllMemberList();
	public void updateMemberByIdAndPassword(Member member);
	public void deleteMemberByIdAndPassword(Member member);
}
