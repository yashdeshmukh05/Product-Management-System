package com.pheonix.productManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.pheonix.productManagementSystem.Repository")
@EntityScan(basePackages = "com.pheonix.productManagementSystem.Entity")
public class ProductManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductManagementSystemApplication.class, args);
	}

}
