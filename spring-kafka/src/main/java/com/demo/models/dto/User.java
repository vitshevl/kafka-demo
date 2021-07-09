package com.demo.models.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;





@Component
@Data
@Accessors(chain = true)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = User.class)
public class User implements Serializable {
  private String userId;
  private String userName;
  @Override
  public String toString() {
    return "User{" +
        "userId='" + userId + '\'' +
        ", userName='" + userName + '\'' +
        '}';
  }
}