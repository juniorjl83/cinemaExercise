package com.medrar.cine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.medrar.cine.domain.Simulation;

@SpringBootApplication
public class CineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CineApplication.class, args);
		Simulation simulation = new Simulation();
		simulation.execute();
	}

}
