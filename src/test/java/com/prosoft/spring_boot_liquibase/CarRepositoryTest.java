package com.prosoft.spring_boot_liquibase;

import com.prosoft.spring_boot_liquibase.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@DataR2dbcTest
@ActiveProfiles("test")
class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    void testFindAll() {
    }

}
