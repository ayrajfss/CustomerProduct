package com.example.CustomerProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.cache.annotation.EnableCaching;

@OpenAPIDefinition(
		info = @Info(title = "Customer & Product API", version = "1.0", description = "API for managing customers and products")
)

@SpringBootApplication
@EnableCaching
public class CustomerProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerProductApplication.class, args);
	}

}
