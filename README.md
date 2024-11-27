[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=openjdk&logoColor=FFFFFF)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-FFFFFF??style=for-the-badge&logo=Spring)](https://spring.io/projects/spring-boot/)
[![Liquibase](https://img.shields.io/badge/Liquibase-FFFFFF??style=for-the-badge&logo=Liquibase&logoColor=3861F6)](https://www.liquibase.com/)

# Пример управления системой миграции в Spring-boot приложении - Настройка Liquibase с профилем test при активации которого liquibase поднимает базу БД 'autoshop-test'

Запуск тестирования в профиле "test" и использования набора данных для "test" от liquibase

 - H2
```txt
DB_CLOSE_DELAY=-1 позволяет базе данных оставаться в памяти после завершения соединения
Консоль H2 будет доступна по адресу: http://localhost:8080/h2-console
PostgreSQL и H2 с настройкой верхнего регистра: @Table("CAR")
```

 - liquibase:
```txt
Каталоги: structure для DDL, data для DML
Имена: Префикс версии + действие + объект
```

### References
