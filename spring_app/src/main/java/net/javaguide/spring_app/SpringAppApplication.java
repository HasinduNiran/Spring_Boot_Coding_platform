package net.javaguide.spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		try {
			System.out.println("Starting Spring Boot application...");
			SpringApplication.run(SpringAppApplication.class, args);
			System.out.println("Application started successfully!");
		} catch (Exception e) {
			System.err.println("Error starting application: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
			}
		};
	}
}
