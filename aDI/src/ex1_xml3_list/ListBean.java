package ex1_xml3_list;

import java.util.List;

public class ListBean {
	
	private List<Integer> intList;
	private List<MemberBean> memberList;
	
	public ListBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	public void setMemberList(List<MemberBean> memberList) {
		this.memberList = memberList;
	}
	public List<Integer> getIntList() {
		return intList;
	}
	public List<MemberBean> getMemberList() {
		return memberList;
	}
	
	

}
