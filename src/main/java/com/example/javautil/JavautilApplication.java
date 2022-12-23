package com.example.javautil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nike.utils.CommonLogging;

@SpringBootApplication
public class JavautilApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		
		CommonLogging.test();
		SpringApplication.run(JavautilApplication.class, args);
	}
	
	public void test() {
		
	}

}
