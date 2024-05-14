package com.bezkoder.spring.security.jwt.payload.response;

import lombok.Data;

import java.util.List;
@Data
public class UserInfoResponse {
	private String id;
	private String username;
	private String email;
	private List<String> roles;
	private String jwtToken;
	private String refreshToken;

	public UserInfoResponse(String id, String username, String email, List<String> roles, String jwtToken, String refreshToken) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.jwtToken = jwtToken;
		this.refreshToken = refreshToken;
	}
}
