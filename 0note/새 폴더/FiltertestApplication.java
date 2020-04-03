package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan	//'filter사용할꺼임'이라는 어노테이션
@SpringBootApplication
public class FiltertestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiltertestApplication.class, args);
	}

}
