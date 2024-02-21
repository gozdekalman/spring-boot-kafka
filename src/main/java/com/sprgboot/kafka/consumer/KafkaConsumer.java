package com.sprgboot.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "testTopic", groupId = "myGroup")
    public void listenGroup(String message) {
        System.out.println("Received Message in group 'myGroup': " + message);
    }}
