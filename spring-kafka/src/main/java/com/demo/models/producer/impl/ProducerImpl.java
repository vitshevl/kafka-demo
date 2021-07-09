package com.demo.models.producer.impl;

import com.demo.models.producer.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProducerImpl implements Producer {

  private static final String TOPIC = "users";


  private final KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(String topic, String message) {
    System.out.println(String.format("#### -> Producing message -> %s", message));
    this.kafkaTemplate.send(TOPIC, message);
  }
}
