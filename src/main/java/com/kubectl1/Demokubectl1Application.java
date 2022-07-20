package com.kubectl1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demokubectl1Application {
	
	@GetMapping("/message")
	public String message() {
		
		return "Deploye application into kubernates from docker";
		
	}


	public static void main(String[] args) {
		SpringApplication.run(Demokubectl1Application.class, args);
	}

}
