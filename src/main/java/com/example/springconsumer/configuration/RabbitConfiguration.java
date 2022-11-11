package com.example.springconsumer.configuration;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.support.converter.MessageConverter;

@Configuration
public class RabbitConfiguration {

    @Bean
    public MessageConverter jsonConvert() {
        return new Jackson2JsonMessageConverter();
    }
}
