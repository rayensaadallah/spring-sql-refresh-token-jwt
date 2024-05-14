package com.bezkoder.spring.security.jwt.repository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.security.jwt.models.RefreshToken;
import com.bezkoder.spring.security.jwt.models.User;

@Repository
public interface RefreshTokenRepository extends MongoRepository<RefreshToken, String> {
  Optional<RefreshToken> findByToken(String token);

  int deleteByUser(User user);
}
