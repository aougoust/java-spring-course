package com.example;

import com.example.dto.Uzyszkodnik;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.AbstractEnvironment;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	String weatherType(){
		return "weather type";
	}

	@Bean
	String otherWeatherType(){
		return "other Weather Type";
	}
}
