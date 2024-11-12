package com.springboot.LearnXAddressService;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnX1Application {

	public static void main(String[] args) {
		SpringApplication.run(LearnX1Application.class, args);
	}

	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}

}
