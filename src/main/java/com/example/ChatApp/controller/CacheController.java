package com.example.ChatApp.controller;

import com.example.ChatApp.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cache")
public class CacheController {

    private final CacheService cacheService;

    @Autowired
    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    // Store message with sender information
    @PostMapping("/store")
    public String storeMessage(@RequestParam String key, @RequestParam String sender, @RequestParam String message) {
        cacheService.storeMessage(key, sender, message);
        return "Message sent successfully!";
    }

    // Retrieve messages
    @GetMapping("/retrieve")
    public List<String> retrieveMessages(@RequestParam String key) {
        return cacheService.getMessages(key);
    }
}

