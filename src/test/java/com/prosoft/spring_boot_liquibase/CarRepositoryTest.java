package com.prosoft.spring_boot_liquibase;

import com.prosoft.spring_boot_liquibase.domain.Car;
import com.prosoft.spring_boot_liquibase.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    void testFindAll() {
        Iterable<Car> cars = carRepository.findAll();
        assertThat(cars).isNotEmpty();
        assertThat(cars).hasSize(2);
    }

    @Test
    void testFindById() {
        Optional<Car> carOptional = carRepository.findById(1L);
        assertThat(carOptional).isPresent();
        Car car = carOptional.get();
        assertThat(car.getBrand()).isEqualTo("BMW");
        assertThat(car.getColor()).isEqualTo("black");
    }

    @Test
    void testSave() {
        Car savedCar = carRepository.save(new Car("Audi", "blue"));
        assertThat(savedCar.getId()).isNotNull();
        assertThat(savedCar.getBrand()).isEqualTo("Audi");
        assertThat(savedCar.getColor()).isEqualTo("blue");
        Iterable<Car> cars = carRepository.findAll();
        assertThat(cars).isNotEmpty();
        assertThat(cars).hasSize(3);
    }

    @Test
    void testDeleteById() {
        carRepository.deleteById(1L);
        Optional<Car> carOptional = carRepository.findById(1L);
        assertThat(carOptional).isNotPresent();
        Iterable<Car> cars = carRepository.findAll();
        assertThat(cars).hasSize(2);
    }
}
