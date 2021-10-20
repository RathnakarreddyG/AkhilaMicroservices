package com.hospitalserviceregistry.hospitalserviceregistryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HospitalserviceregistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalserviceregistryServiceApplication.class, args);
	}

}
