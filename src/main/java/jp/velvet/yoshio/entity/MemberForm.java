package jp.velvet.yoshio.entity;

import java.util.List;

import jp.velvet.yoshio.mybatis.Member;

public class MemberForm {
	
	private List<Member> members;

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}
