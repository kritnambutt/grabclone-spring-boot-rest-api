# Getting Started
# 1. Run service

```bash
$ ./mvnw spring-boot:run
```

# 2. Insert sample data
> it need to insert data by manual for now

## 2.1 Connect DB (after run service)
> You can check configuration for connection db in /src/main/resources/application.properties
```
## PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=mysecretpassword
```

## 2.2 Insert sample data to DB
> insert sample data from /src/main/resoures/data.sql to DB  <br />