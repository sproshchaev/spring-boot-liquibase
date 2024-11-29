[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=openjdk&logoColor=FFFFFF)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-FFFFFF??style=for-the-badge&logo=Spring)](https://spring.io/projects/spring-boot/)
[![Liquibase](https://img.shields.io/badge/Liquibase-FFFFFF??style=for-the-badge&logo=Liquibase&logoColor=3861F6)](https://www.liquibase.com/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-3E6389??style=for-the-badge&logo=PostgreSQL&logoColor=FFFFFF)](https://www.postgresql.org/)

# В процессе настройки!

# Пример управления системой миграции в Spring-boot приложении (r2dbc) - Настройка Liquibase с профилем test при активации которого liquibase поднимает базу БД 'autoshop-test' на embedded-postgres
1) Основная база поднимается на реактивном стеке r2dbc через docker-compose.yaml, конфигурация в application.properties

2) Запуск тестирования в профиле "test" и использования набора данных для "test" от liquibase, конфигурация в application-test.properties

 - Embedded PostgreSQL
```txt
Запускается без Docker
```

 - liquibase:
```txt
Каталоги: structure для DDL, data для DML
Имена: Префикс версии + действие + объект
```

### References
