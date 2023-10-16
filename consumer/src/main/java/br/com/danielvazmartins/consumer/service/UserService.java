package br.com.danielvazmartins.consumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.danielvazmartins.consumer.model.UserModel;

@Service
public class UserService {
    @KafkaListener(topics = "register-user", groupId = "KafkaDIO")
    public void getUserFromKafka(ConsumerRecord<String, String> consumerRecord) {
        String userToRegister = consumerRecord.value();
        System.out.println(userToRegister);

        ObjectMapper mapper = new ObjectMapper();
        UserModel user = null;
        try {
            user = mapper.readValue(userToRegister, UserModel.class);
        } catch (JsonProcessingException e) {
            System.out.println("Erro para ler usuário");
            e.printStackTrace();
        }
        
        if (user != null) {
            System.out.println(user.toString());
            System.out.println(user.getName());
        }
    }
}
