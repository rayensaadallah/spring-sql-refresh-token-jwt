package com.bezkoder.spring.security.jwt.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.security.jwt.models.ERole;
import com.bezkoder.spring.security.jwt.models.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
