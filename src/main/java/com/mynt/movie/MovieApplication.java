package com.mynt.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

import java.util.Arrays;

@EnableGlobalAuthentication
@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MovieApplication.class, args);

		System.out.println("Application Running...");

	}
}
