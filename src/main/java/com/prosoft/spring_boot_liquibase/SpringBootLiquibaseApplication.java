package com.prosoft.spring_boot_liquibase;

import com.prosoft.spring_boot_liquibase.domain.Car;
import com.prosoft.spring_boot_liquibase.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import reactor.core.publisher.Flux;

@SpringBootApplication
@EnableR2dbcRepositories
@ComponentScan(basePackages = "com.prosoft.spring_boot_liquibase")
public class SpringBootLiquibaseApplication implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLiquibaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Spring Boot Liquibase started");
        carRepository.findAll()
                .doOnNext(car -> System.out.println("Car: " + car))
                .thenMany(
                        carRepository.saveAll(Flux.just(
                                new Car(null, "Toyota", "Red"),
                                new Car(null, "Ford", "Blue")
                        ))
                )
                .thenMany(carRepository.findAll())
                .doOnNext(car -> System.out.println("Saved Car: " + car))
                .blockLast();
    }
}
