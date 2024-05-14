package com.bezkoder.spring.security.jwt;

import com.bezkoder.spring.security.jwt.models.ERole;
import com.bezkoder.spring.security.jwt.models.Role;
import com.bezkoder.spring.security.jwt.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityRefreshTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityRefreshTokenApplication.class, args);
	}
	@Bean
	CommandLineRunner init(RoleRepository roleRepository) {
		return args -> {
			// Ensure roles are created
			Arrays.stream(ERole.values()).forEach(roleName -> {
				if (roleRepository.findByName(roleName).isEmpty()) {
					roleRepository.save(new Role(roleName));
				}
			});
		};
	}

}
