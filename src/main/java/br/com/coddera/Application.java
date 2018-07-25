package br.com.coddera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.controller.CustomController;

@SpringBootApplication
@ComponentScan(basePackageClasses = CustomController.class)
@Import({SwaggerConfig.class})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
