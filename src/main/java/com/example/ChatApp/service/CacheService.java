package com.example.ChatApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CacheService {

    private final StringRedisTemplate redisTemplate;

    @Autowired
    public CacheService(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    // Store message with sender
    public void storeMessage(String key, String sender, String message) {
        String formattedMessage = sender + ": " + message;  // Format message with sender's name
        redisTemplate.opsForList().leftPush(key, formattedMessage);  // Store formatted message in Redis list
    }

    // Retrieve all messages
    public List<String> getMessages(String key) {
        return redisTemplate.opsForList().range(key, 0, -1);  // Get messages from Redis list
    }
}

