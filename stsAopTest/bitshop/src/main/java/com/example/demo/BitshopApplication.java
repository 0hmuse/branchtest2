package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy //자동으로 객체 만들어줘
public class BitshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitshopApplication.class, args);
	}

}
