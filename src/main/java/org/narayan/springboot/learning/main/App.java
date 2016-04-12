package org.narayan.springboot.learning.main;

import static org.springframework.util.StringUtils.hasText;

import org.narayan.springboot.learning.beans.Greeter;
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
	
	
	/**
	 * Declaring bean for Greeter
	 * @return
	 */
	@Bean
	Greeter greeter() {
		return new Greeter() {
			@Override
			public String greet(String name) {
				return "Hello "+ ( hasText(name) ? name : "guest");  
			}
		};
	}
	
	/**
	 * Declaring CommandLineRunner bean and injecting Greeter to this bean.
	 * @param greeter
	 * @return
	 */
	@Bean
	CommandLineRunner commandLineRunner(final Greeter greeter) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println(greeter.greet("unmattavesa"));
			}
		};
	}
}
