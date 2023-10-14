package br.com.danielvazmartins.producer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // Create a constructor with one parameter to each field not initialized
public class UserService {
    private final KafkaTemplate<Object, Object> kafkaTemplate;

    public <T> void sendUserToKafka(String topicName, T topicData) {
        kafkaTemplate.send(topicName, topicData);
    }
}
