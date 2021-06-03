package com.zeroquo.testjpa;

import com.zeroquo.testjpa.service.EnderecoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadPosData(EnderecoService service) {
		return (args) -> {
			service.test();
		};
	}
}
