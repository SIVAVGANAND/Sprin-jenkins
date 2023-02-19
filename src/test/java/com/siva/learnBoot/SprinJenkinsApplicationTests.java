package com.siva.learnBoot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprinJenkinsApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(SprinJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}
	
	

}
