package com.notificationapi.notificationapi.config;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "notificacion.rabbitmq")
public class NotificacionQueueConfig {
    public String exchangeName;
    public String routingKeyName;
    public String queueName;



}
