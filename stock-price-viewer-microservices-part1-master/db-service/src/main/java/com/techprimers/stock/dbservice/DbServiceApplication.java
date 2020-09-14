package com.techprimers.stock.dbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 1) start the @EnableEurekaServer app first; 2) 
 Start any @EurekaDiscoveryClient apps afterward. 
 This is mostly just a timing issue (tries to connect, fails, tries again, fails, tries again, succeeds)
 */
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.techprimers.stock.dbservice.repository")
@SpringBootApplication
public class DbServiceApplication {

	// ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root'
	public static void main(String[] args) {
		SpringApplication.run(DbServiceApplication.class, args);
	}
}
