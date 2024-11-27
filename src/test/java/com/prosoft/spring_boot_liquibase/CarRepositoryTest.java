package com.prosoft.spring_boot_liquibase;

import com.prosoft.spring_boot_liquibase.domain.Car;
import com.prosoft.spring_boot_liquibase.repository.CarRepository;
import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static io.zonky.test.db.AutoConfigureEmbeddedDatabase.DatabaseProvider.ZONKY;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureEmbeddedDatabase(provider = ZONKY)
class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    void testFindAll() {
        Iterable<Car> cars = carRepository.findAll();
        assertThat(cars).isNotEmpty();
        assertThat(cars).hasSize(4);
    }

    @Test
    void testFindById() {
        Optional<Car> carOptional = carRepository.findById(1L);
        assertThat(carOptional).isPresent();
        Car car = carOptional.get();
        assertThat(car.getBrand()).isEqualTo("BMW-TEST");
        assertThat(car.getColor()).isEqualTo("black-test");
    }

    @Test
    void testSave() {
        Car savedCar = carRepository.save(new Car("AUDI-TEST", "blue-test"));
        assertThat(savedCar.getId()).isNotNull();
        assertThat(savedCar.getBrand()).isEqualTo("AUDI-TEST");
        assertThat(savedCar.getColor()).isEqualTo("blue-test");
        Iterable<Car> cars = carRepository.findAll();
        assertThat(cars).isNotEmpty();
        assertThat(cars).hasSize(5);
    }

    @Test
    void testDeleteById() {
        carRepository.deleteById(1L);
        Optional<Car> carOptional = carRepository.findById(1L);
        assertThat(carOptional).isNotPresent();
        Iterable<Car> cars = carRepository.findAll();
        assertThat(cars).hasSize(4);
    }
}
