package com.example.demo4pods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Demo4podsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo4podsApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "hello docker";
	}

}
