package com.example.Office;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages= {"com.example"})
@EntityScan(basePackages= {"com.example"})
@ComponentScan(basePackages= {"com.example"})
@SpringBootApplication
public class OfficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficeApplication.class, args);
	}

}
