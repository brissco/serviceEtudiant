package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class ServiceEtudiant2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEtudiant2Application.class, args);
	}

}
