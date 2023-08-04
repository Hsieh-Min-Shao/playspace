package com.demo.playspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostgisApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgisApplication.class, args);
	}

//	@Bean
//	public JtsModule jtsModule() {
//		// This module will provide a Serializer for geometries
//		return new JtsModule();
//	}

}
