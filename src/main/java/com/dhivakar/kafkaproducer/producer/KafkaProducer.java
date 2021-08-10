package com.dhivakar.kafkaproducer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        for(int i=0;i<=10;i++) {
            kafkaTemplate.send("BankingTopicV1", msg + i);
        }
    }
}
