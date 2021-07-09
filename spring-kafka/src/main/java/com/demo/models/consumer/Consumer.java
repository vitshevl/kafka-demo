package com.demo.models.consumer;


import java.io.IOException;

public interface Consumer {

  void consume(String message) throws IOException;
}
