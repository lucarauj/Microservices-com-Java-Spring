[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/Microservices-com-Java-Spring-RabbitMQ-SMTP/blob/main/LICENSE)

<h1 align="center">Microservices com Java, Spring, RabbitMQ e SMTP</h1>

<p align="center"><img width="500px" src="https://raw.githubusercontent.com/lucarauj/Microservices-com-Java-Spring-RabbitMQ-SMTP/main/images/Comunica%C3%A7%C3%A3o%20ass%C3%ADncrona.png" /></p>

<hr>

## Tecnologias utilizadas

- Java 17
- Maven
- Spring Boot
- Spring Data JPA
- Spring Validation
- Spring AMQP
- Spring Mail
- PostgreSQL
- Rabbit MQ
- Cloud AMQP
- SMTP Mailtrap

<hr>
<br>

# Parte I - Microservice User

<br>

## Dependências

- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Validation
- Spring for RabbitMQ

<br>

## Anotações

- @Bean
- @Component
- @Config
- @Email
- @Entity
- @GeneratedValue(strategy = GenerationType.AUTO)
- @Id
- @NotBlank
- @PostMapping
- @RestController
- @RequestBody
- @Service
- @Table
- @Transactional
- @Valid
- @Value

<hr>
<br>

# Parte II - Microservice E-mail

<br>

## Dependências

- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Validation
- Spring for RabbitMQ
- Java Mail Sender

<br>

## Anotações

- @Bean
- @Column
- @Component
- @Configuration
- @Service
- @Transactional
- @Value

<br>

## Envio de email - Mailtrap

- Configurando *application.properties*:

```
spring.mail.host=sandbox.smtp.mailtrap.io
spring.mail.port=2525
spring.mail.username=***********
spring.mail.password=***********
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

<p align="left"><img width="900px" src="https://raw.githubusercontent.com/lucarauj/Microservices-com-Java-Spring-RabbitMQ-SMTP/main/images/Mailtrap.png" /></p>

<br>

# 👨🏼‍🎓 Aluno

Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
