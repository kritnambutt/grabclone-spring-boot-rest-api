package com.kritnambutt.grabcloneapi;

//import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrabcloneapiApplication {

//	@Autowired
//	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(GrabcloneapiApplication.class, args);
//		System.out.println(environment.getProperty("baeldung.presentation"));
	}

}
