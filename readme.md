# 📰 Send Email Service
Microservice de envio de email através de SMTP do Gmail!

## 👨‍💻 Tecnologias:
- Spring Boot
- Java Mail Sender
- Validation
- PostgreSQL
- JPA / Hibernate
- Spring Dev Tools
- Lombok
- RabbitMQ
- CloudAMQP

## 🐇 RabbitMQ:
O RabbitMQ é um message broker altamente consolidado e utilizado por quem trabalha com comunicação entre sistemas. Operando de forma assíncrona, ele age como um intermediário que processa as nossas mensagens entre produtores e consumidores, além de contar com filas que possuem diversas opções de encaminhamento.

## 🎯 Objetivo:
O objetivo do projeto é construir um microserviço de email para trabalhar de forma independente e autônoma dentro da arquitetura exercendo seu papel específico que é o envio de email com sua base isolada. 

Através da comunicação assíncrona vamos utilizar Spring AMQP e o RabbitMQ para criar uma instância de uma fila para ficar ouvindo mensagens de um serviço consumidor, organizar as mensagens em fila e distribuilas do exchange. Além disso, vamos monitorar através de diversas métricas o funcionamento da mensageria.

<img src="https://www.cloudamqp.com/img/blog/exchanges-bidings-routing-keys.png">

## 👩‍🏫 Instrutora:
Esse projeto foi originalmente ministrado pela Michelli Brito.
