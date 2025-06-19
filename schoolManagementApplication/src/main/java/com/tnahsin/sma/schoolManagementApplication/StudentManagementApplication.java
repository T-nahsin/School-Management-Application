package com.tnahsin.sma.schoolManagementApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.tnahsin.sma.schoolManagementApplication.repository")
public class StudentManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementApplication.class, args);
	}
}
