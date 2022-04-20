package com.rsystem.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureSimpleValidationApplication {

	public String message() {
		return "Hello Azure";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureSimpleValidationApplication.class, args);
	}

}
