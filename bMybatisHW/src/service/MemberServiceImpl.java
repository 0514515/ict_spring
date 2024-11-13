package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Member;
import repository.MemberRepository;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public void createMember(Member member) {
		memberRepository.insertMember(member);
	}

	@Override
	public List<Member> getAllMemberList() {
		return memberRepository.selectMemberList();
	}

	@Override
	public void updateMemberByIdAndPassword(Member member) {
		memberRepository.updateMemberByIdAndPassword(member);
	}

	@Override
	public void deleteMemberByIdAndPassword(Member member) {
		memberRepository.deleteMemberByIdAndPassword(member);
	}

	
}
