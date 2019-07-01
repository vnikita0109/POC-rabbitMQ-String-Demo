package com.stackroute.rabbitmqproducer.serviceProducer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${stackroute.rabbitmq.exchange}")
    private String exchangeName;

    @Value("${stackroute.rabbitmq.routingkey}")
    private String routingkey;

    public void send(String msg) {
        rabbitTemplate.convertAndSend(exchangeName, routingkey, msg);
        System.out.println("Send msg = " + msg);
    }
}