package com.eci.arcn.consumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${app.rabbitmq.queue}")
    private String queueName;

    // Declarar la cola asegura que exista si el consumidor inicia primero.
    // Debe coincidir con la declaración del productor (durable=true).
    @Bean
    Queue queue() {
        return new Queue(queueName, true);
    }
}
