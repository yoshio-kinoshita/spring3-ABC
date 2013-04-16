package jp.velvet.yoshio.logic;

import java.util.List;

import jp.velvet.yoshio.mybatis.Member;
import jp.velvet.yoshio.mybatis.MemberMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<Member> exec() {

		return memberMapper.selectAll();
	}
}
