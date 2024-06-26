package com.bezkoder.spring.security.jwt.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "roles")
public class Role {
  @Id
  private String id;

  private ERole name;

  public Role() {
  }

  public Role(ERole name) {
    this.name = name;
  }



  public ERole getName() {
    return name;
  }

  public void setName(ERole name) {
    this.name = name;
  }
}
