package org.narayan.springboot.learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 * 
 * @author unmattavesa
 */
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Hello Spring Boot!!!!");
			}
		};
	}
}
