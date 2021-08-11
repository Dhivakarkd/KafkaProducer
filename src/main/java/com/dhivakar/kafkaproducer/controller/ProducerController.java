package com.dhivakar.kafkaproducer.controller;

import com.dhivakar.kafkaproducer.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("producer")
public class ProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;


    @GetMapping(value = "/{id}" , produces = "application/json")
    public String triggerProducer(@PathVariable int id) {
        kafkaProducer.sendMessage("hello : ");
        return "successfull";
    }

}
