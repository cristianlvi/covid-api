package com.project.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CovidApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidApplication.class, args);
	}

}
