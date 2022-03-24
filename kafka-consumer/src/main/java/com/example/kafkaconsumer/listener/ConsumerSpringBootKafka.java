package com.example.kafkaconsumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerSpringBootKafka {

    private final Logger logger = LoggerFactory.getLogger(ConsumerSpringBootKafka.class);

    @KafkaListener(topics = "${topic.springboot-kafka}", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("Consuming message %s", message));
    }
}