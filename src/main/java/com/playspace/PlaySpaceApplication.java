package com.playspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaySpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaySpaceApplication.class, args);
	}

//	@Bean
//	public JtsModule jtsModule() {
//		// This module will provide a Serializer for geometries
//		return new JtsModule();
//	}

}
