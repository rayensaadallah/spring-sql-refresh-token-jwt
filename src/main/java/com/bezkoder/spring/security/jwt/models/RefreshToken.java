package com.bezkoder.spring.security.jwt.models;

import java.time.Instant;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "refreshtoken")
public class RefreshToken {
  @Id
  private String id;

  @DBRef
  private User user;

  private String token;

  private Instant expiryDate;


}
