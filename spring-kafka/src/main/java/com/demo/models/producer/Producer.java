package com.demo.models.producer;




public interface Producer {

  void sendMessage(String topic, String message);
}
