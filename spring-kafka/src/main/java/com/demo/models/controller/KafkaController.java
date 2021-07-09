package com.demo.models.controller;

import com.demo.models.dto.User;
import com.demo.models.producer.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
public class KafkaController {

  private final Producer producer;



  @PostMapping(value = "/publish")
  public void sendMessageToKafkaTopic(@RequestBody User user) {
    this.producer.sendMessage("users", user.toString());
  }



}