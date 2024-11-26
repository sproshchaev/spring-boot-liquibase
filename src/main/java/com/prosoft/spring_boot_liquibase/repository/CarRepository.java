package com.prosoft.spring_boot_liquibase.repository;

import com.prosoft.spring_boot_liquibase.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
