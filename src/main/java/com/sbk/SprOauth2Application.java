package com.sbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SprOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SprOauth2Application.class, args);
	}
}
