package jp.velvet.yoshio.logic;

import jp.velvet.yoshio.entity.Hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
	
	
	private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

	@Override
	public String exec(Hello hello) {
		
		logger.info("");
		
		return null;
	}

}
