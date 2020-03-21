package com.medrar.cine;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.medrar.cine.domain.Client;
import com.medrar.cine.domain.Simulation;

public class SimulationTest {

	@Test
	public void clientsGenerationTest() {
		Simulation simulation = new Simulation();
		simulation.execute();
		List<Client> clients = simulation.getClients();

		assertTrue(clients.size() == (8 * 9 * 2));

		for (Client client : clients) {
			assertTrue(!StringUtils.isEmpty(client.getName()));
			assertTrue(client.getAge() > 0 && client.getAge() < 71);
			assertTrue(client.getBalance() > 0 && client.getBalance() < 101);
		}

	}
}
