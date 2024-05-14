package com.bezkoder.spring.security.jwt.models;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="user")
public class User {
  @Id
  private String id;

  private String username;

  private String email;

  private String password;

  @DBRef
  private Set<Role> roles = new HashSet<>();


  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }
}
