package com.hiztxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthcService {

	public static void main(String[] args) {
		SpringApplication.run(AuthcService.class, args);
	}

}
