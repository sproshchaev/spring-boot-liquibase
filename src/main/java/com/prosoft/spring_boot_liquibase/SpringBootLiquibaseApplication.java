package com.prosoft.spring_boot_liquibase;

import com.prosoft.spring_boot_liquibase.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLiquibaseApplication implements CommandLineRunner {

	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiquibaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring Boot Liquibase started");
		System.out.println("Cars: " + carRepository.findAll());
	}
}
