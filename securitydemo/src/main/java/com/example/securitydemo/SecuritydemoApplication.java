package com.example.securitydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SecuritydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritydemoApplication.class, args);
	}

}
