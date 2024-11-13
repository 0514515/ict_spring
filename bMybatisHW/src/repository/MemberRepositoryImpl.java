package repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Member;

@Repository("memberRepositoryImpl")
public class MemberRepositoryImpl implements MemberRepository{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertMember(Member member) {
		sqlSessionTemplate.insert("com.ict.Member.insertMember",member);
	}

	@Override
	public List<Member> selectMemberList() {
		return sqlSessionTemplate.selectList("com.ict.Member.selectMemberList");
	}

	@Override
	public void updateMemberByIdAndPassword(Member member) {
		
		sqlSessionTemplate.update("com.ict.Member.updateMemberByIdAndPassword",member);
	}

	@Override
	public void deleteMemberByIdAndPassword(Member member) {
		sqlSessionTemplate.delete("com.ict.Member.deleteMemberByIdAndPassword",member);
	}

}
