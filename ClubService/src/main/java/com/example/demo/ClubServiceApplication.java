package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClubServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClubServiceApplication.class, args);
	}

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
