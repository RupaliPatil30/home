package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;





@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Healthcare.mangment.system.project.Repository")
public class HealthcareMangmentSystemProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(HealthcareMangmentSystemProjectApplication.class, args);
	}
}
