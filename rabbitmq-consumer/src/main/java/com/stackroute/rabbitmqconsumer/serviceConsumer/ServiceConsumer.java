package com.stackroute.rabbitmqconsumer.serviceConsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Component;

@Component
public class ServiceConsumer implements RabbitListenerConfigurer{
    @RabbitListener(queues="${stackroute.rabbitmq.queue}")

    public  void recievedMessage(String message){
        System.out.println("Recieved message from RabbitMQ : "+message);
    }

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {

    }
}
