package com.demo.models.consumer.impl;

import com.demo.models.consumer.Consumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class ConsumerImpl implements Consumer {

  @KafkaListener(topics = "users", groupId = "group_id")
  public void consume(String message) throws IOException {
    System.out.println(String.format("#### -> Consumed message -> %s", message));
  }



}