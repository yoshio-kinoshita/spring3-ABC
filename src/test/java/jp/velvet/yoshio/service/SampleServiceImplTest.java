package jp.velvet.yoshio.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import jp.velvet.yoshio.mybatis.Member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:root-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleServiceImplTest {

	@Autowired
	private SampleService sampleService;

	@Test
	public void selectAll() {
		List<Member> members = sampleService.selectAll();
		assertEquals(5, members.size());
	}
}
