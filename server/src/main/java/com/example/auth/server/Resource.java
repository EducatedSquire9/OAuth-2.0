package com.example.auth.server;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/main")
public class Resource {

	@GetMapping("/principal")
	public Principal user(Principal principal) {
		return principal;
	}
	
	@GetMapping
	public String main() {
		return "OAuth 2.0 with Spring Boot";
	}
}
