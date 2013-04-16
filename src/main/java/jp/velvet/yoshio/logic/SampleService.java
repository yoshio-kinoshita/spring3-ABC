package jp.velvet.yoshio.logic;

import java.util.List;

import jp.velvet.yoshio.mybatis.Member;

public interface SampleService {

	public List<Member> selectAll();

	public void save(List<Member> members);

}
