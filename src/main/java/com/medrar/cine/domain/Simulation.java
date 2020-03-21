package com.medrar.cine.domain;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class Simulation {

	private List<Client> clients;
	private Cinema cinema;

	public Simulation() {
		this.clients = new ArrayList<Client>();
	}

	public void execute() {
		generateClients();
		printClientsGeneration();
		createCinema();
		printCinemaAndMovie();
		fillCinema();
		printResults();

	}

	private void printResults() {
		System.out.println("*****RESULTS*****");
		System.out.println("Available chairs = " + cinema.getAvailableChairs());
		System.out.println("Busy chairs = " + cinema.getBusyChairs());
		System.out.println("\n");
		
	}

	private void fillCinema() {
		for (Client client : clients) {
			int col = getRandomNumber(0, 8);
			int row = getRandomNumber(0, 7);

			Chair[][] chairs = cinema.getMovie().getChairs();
			Chair chair = chairs[row][col];
			if (!chair.isBusy() 
					&& cinema.getTicketCost() <= client.getBalance()
					&& cinema.getMovie().getMinimumAge() <= client.getAge()) {
				chair.setBusy(true);
				client.setBalance(client.getBalance() - cinema.getTicketCost());
			}
		}

	}

	private void printCinemaAndMovie() {
		System.out.println("*****CINEMA GENERATION*****");
		System.out.println(cinema);
		System.out.println("Available chairs = " + cinema.getAvailableChairs());
		System.out.println("Busy chairs = " + cinema.getBusyChairs());
		System.out.println("\n");
	}

	private void createCinema() {
		Movie movie = generateMovie();
		cinema = new Cinema(generateMovie(), getRandomNumber(10, 100));
	}

	private Movie generateMovie() {
		Movie movie = new Movie();
		movie.setDirectorName(getFakeName());
		movie.setDurationInMinutes(getRandomNumber(80, 180));
		movie.setMinimumAge(getRandomNumber(1, 18));
		movie.setTitle(getFakeName());
		return movie;
	}

	private void printClientsGeneration() {
		System.out.println("*****CLIENTS GENERATION*****");
		for (Client client : clients) {
			System.out.println(client);
		}
		System.out.println("\n");

	}

	private void generateClients() {
		for (int i = 0; i < (8 * 9 * 2); i++) {
			Client client = new Client();
			client.setName(getFakeName());
			client.setAge(getRandomNumber(1, 70));
			client.setBalance(getRandomNumber(1, 100));
			clients.add(client);
		}
	}

	private int getRandomNumber(int rsnum, int renum) {
		int randomNum = rsnum + (int) (Math.random() * ((renum - rsnum) + 1));
		return randomNum;
	}

	private String getFakeName() {
		Faker faker = new Faker();
		StringBuilder sb = new StringBuilder();
		sb.append(faker.name().firstName());
		sb.append(" ");
		sb.append(faker.name().lastName());
		return sb.toString();
	}

	public List<Client> getClients() {
		return clients;
	}

}
