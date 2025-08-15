package com.techeazy.devops.trafficview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrafficviewApplication {

	// feature 1 changes ---Main app file changes in feature branch
	public static void main(String[] args) {
		SpringApplication.run(TrafficviewApplication.class, args);
	}

}
