package com.example.JenkinJobApplication;

import jakarta.annotation.PostConstruct;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinJobApplication {

	public static Logger logger = (Logger) LogFactory.getLog(JenkinJobApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Welcome to EnggAdda");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinJobApplication.class, args);
	}

}
