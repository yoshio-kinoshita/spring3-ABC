package jp.velvet.yoshio;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {

	private static final Logger logger = LoggerFactory
			.getLogger(ExampleAspect.class);

	@Before("execution(* selectAll())")
	public void before() {
		logger.info("Before! *** メソッドが呼ばれる前");
	}

	@After("execution(* selectAll())")
	public void after() {
		logger.info("After! *** メソッドが呼ばれる後");
	}

}
