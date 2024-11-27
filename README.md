[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=openjdk&logoColor=FFFFFF)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-FFFFFF??style=for-the-badge&logo=Spring)](https://spring.io/projects/spring-boot/)
[![Liquibase](https://img.shields.io/badge/Liquibase-FFFFFF??style=for-the-badge&logo=Liquibase&logoColor=3861F6)](https://www.liquibase.com/)

# Пример управления системой миграции в Spring-boot приложении

1. Настройка Liquibase с одной БД H2 https://github.com/sproshchaev/spring-boot-liquibase/tree/feature/add-liquibase  
2. Настройка Liquibase с двумя профилями (`black`/`white`) и с двумя БД H2 (`autoshopblack`/`autoshopwhite`) https://github.com/sproshchaev/spring-boot-liquibase/tree/feature/add-liquibase-profiles  
3. Настройка Liquibase с одной БД H2 и с классом тестирования данных из liquibase https://github.com/sproshchaev/spring-boot-liquibase/tree/feature/add-liquibase-test  
4. Настройка Liquibase с профилем `test` при активации которого liquibase поднимает базу БД 'autoshop-test' https://github.com/sproshchaev/spring-boot-liquibase/tree/feature/add-liquibase-profile-test  
5. Настройка Liquibase с профилем `test` при активации которого liquibase поднимает базу БД 'autoshop-test' на embedded-postgres, основная БД в Docker-контейнере https://github.com/sproshchaev/spring-boot-liquibase/tree/feature/add-liquibase-profile-test-em-postgresql  



### References
`1.` Liquibase https://www.liquibase.com/