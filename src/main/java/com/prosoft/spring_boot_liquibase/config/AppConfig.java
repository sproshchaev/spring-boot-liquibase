package com.prosoft.spring_boot_liquibase.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories
@ComponentScan(basePackages = "com.prosoft.spring_boot_liquibase")
public class AppConfig {
}
