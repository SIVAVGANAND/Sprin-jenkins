package com.siva.learnBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class SprinJenkinsApplication {
	//public static Logger logger= (Logger) LoggerFactory.getLogger(SprinJenkinsApplication.class);
	public static Logger logger=LoggerFactory.getLogger(SprinJenkinsApplication.class);
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		
		logger.info("Application started");

	}
	
	public static void main(String[] args) {
		logger.info("Application is executing...");
		SpringApplication.run(SprinJenkinsApplication.class, args);
	}

}
