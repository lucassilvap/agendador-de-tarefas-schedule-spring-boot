package com.example.agendadordetarefasschedulespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class AgendadorDeTarefasScheduleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendadorDeTarefasScheduleSpringBootApplication.class, args);
	}

}
