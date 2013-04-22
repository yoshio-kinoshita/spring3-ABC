package jp.velvet.yoshio.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:root-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleControllerTest {
	
	@Autowired
	private SampleController sampleController;

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
