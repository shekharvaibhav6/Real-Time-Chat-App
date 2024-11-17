package com.example.ChatApp.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "chat_topic", groupId = "chat-consumer-group")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);  // Log the consumed message
    }
}

