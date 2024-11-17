package com.example.ChatApp.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // Send message to Kafka topic
    public void sendMessage(String message) {
        kafkaTemplate.send("chat_topic", message);  // Topic name: "chat_topic"
    }
}
