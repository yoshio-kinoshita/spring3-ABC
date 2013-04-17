package jp.velvet.yoshio.service;

import java.util.List;

import jp.velvet.yoshio.mybatis.Member;
import jp.velvet.yoshio.mybatis.MemberMapper;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// DIコンテナが管理するインジェクションする対象
@Service
// トランザクションAOP
@Transactional
public class SampleServiceImpl implements SampleService {

	// MemberMapperをインジェクションする
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<Member> selectAll() {

		return memberMapper.selectAll();
	}

	@Override
	public void save(List<Member> members) {

		memberMapper.deleteAll();
		for (Member member : members) {
			if (StringUtils.isNotEmpty(member.getFirstName())) {
				memberMapper.insert(member);
			}
		}
	}
}
