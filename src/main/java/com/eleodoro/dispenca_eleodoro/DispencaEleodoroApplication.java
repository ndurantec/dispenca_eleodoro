package com.eleodoro.dispenca_eleodoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class DispencaEleodoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(DispencaEleodoroApplication.class, args);
	}
	

}
