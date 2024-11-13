package repository;

import java.util.List;

import entity.Member;

public interface MemberRepository {
	public void insertMember(Member member);
	public List<Member> selectMemberList();
	public void updateMemberByIdAndPassword(Member member);
	public void deleteMemberByIdAndPassword(Member member);
}
