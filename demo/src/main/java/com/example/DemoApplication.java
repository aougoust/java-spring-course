package com.example;

import com.example.dto.Uzyszkodnik;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Uzyszkodnik u = Uzyszkodnik.builder().imie("Uncle").nazwisko("Beans").build();
		log.info(u.toString());
	}
}
