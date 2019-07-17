package com.card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan
@EnableSwagger2
@SpringBootApplication


public class CardApplication extends ServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CardApplication.class, args);
	}
	
	
	
}
