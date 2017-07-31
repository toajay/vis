package com.vis.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
public class VisRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisRestApplication.class, args);
		System.out.println("Hello VIS");
		System.out.println("Hello Hi");
		System.out.println("Testing conflict");
	}
	
}
