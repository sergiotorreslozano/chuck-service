package com.chuck.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChuckServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckServiceApplication.class, args);
	}

}


