# 🚀 Spring Enterprise Patterns API

Projeto desenvolvido durante o **Bootcamp Santander 2026 - Back-End com Java**, promovido pela **DIO (Digital Innovation One)**.

O objetivo deste desafio é aplicar padrões utilizados em aplicações corporativas utilizando **Spring Boot**, **Spring Data JPA**, **Flyway**, **PostgreSQL**, **Testcontainers** e boas práticas de arquitetura.

---

## 📚 Tecnologias utilizadas

- Java 21
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- Spring Security
- Spring Validation
- PostgreSQL
- Flyway
- Testcontainers
- Lombok
- MapStruct
- OpenAPI (Swagger)
- Maven

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas:

```
Controller
     │
Service
     │
Repository
     │
Database (PostgreSQL)
```

Organização dos pacotes:

```
src
 └── main
      ├── java
      │     └── br.com.edvan.spring_enterprise_patterns_api
      │             ├── controller
      │             ├── dto
      │             ├── entity
      │             ├── mapper
      │             ├── repository
      │             ├── service
      │             └── exception
      │
      └── resources
            ├── application.properties
            └── db
                 └── migration
```

---

## 💾 Banco de Dados

O versionamento do banco é realizado com **Flyway**.

A primeira migration cria as tabelas:

- tb_user
- tb_customer
- tb_address

---

## 🧪 Testes

Os testes de integração utilizam:

- JUnit 5
- Spring Boot Test
- Testcontainers

Durante a execução dos testes um container PostgreSQL é criado automaticamente.

Executar:

```bash
mvn test
```

---

## ▶️ Executando o projeto

Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/spring-enterprise-patterns-api.git
```

Entre na pasta

```bash
cd spring-enterprise-patterns-api
```

Execute

```bash
mvn spring-boot:run
```

---

## 📖 Documentação da API

Após iniciar a aplicação:

```
http://localhost:8080/swagger-ui/index.html
```

---

## ✅ Build

Compilar o projeto

```bash
mvn clean package
```

Executar testes

```bash
mvn clean test
```

---

## 🎯 Objetivos do desafio

- Aplicar padrões utilizados em aplicações corporativas
- Utilizar Spring Boot de forma estruturada
- Persistência com Spring Data JPA
- Versionamento do banco com Flyway
- Testes automatizados utilizando Testcontainers
- Documentação da API com Swagger
- Boas práticas de desenvolvimento

---

## 👨‍💻 Autor

**Edvan Figuerêdo**

- GitHub: https://github.com/Edvanfigueredo
- LinkedIn: https://www.linkedin.com/in/edvan-figuer%C3%AAdo-araujo-7b8332272

---
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17-blue)
![Flyway](https://img.shields.io/badge/Flyway-Database-red)
![License](https://img.shields.io/badge/License-Study-lightgrey)


---

## 📜 Licença

Este projeto foi desenvolvido exclusivamente para fins de estudo durante o **Bootcamp Santander 2026 - Back-End com Java**, promovido pela **DIO (Digital Innovation One)**.
