package com.medrar.cine.domain;

import org.springframework.util.StringUtils;

public class Cinema {

	private Movie movie;
	private int ticketCost;

	public String getMovieName() {
		if (null != movie && !StringUtils.isEmpty(movie.getTitle())) {
			return movie.getTitle();
		} else {
			return "Movie Tittle is not available in this moment";
		}
	}

	public int getAvailableChairs() {
		int avalilableChairs = 0;
		if (null != movie && movie.getChairs() != null) {
			for (Chair row[] : movie.getChairs()) {
				for (Chair chair : row) {
					if (!chair.isBusy()) {
						avalilableChairs++;
					}
				}
			}
		} else {
			throw new IllegalArgumentException("Avalilable chairs is not available in this moment");
		}
		return avalilableChairs;
	}

	public int getBusyChairs() {
		int busyChair = 0;
		if (null != movie && movie.getChairs() != null) {
			for (Chair row[] : movie.getChairs()) {
				for (Chair chair : row) {
					if (chair.isBusy()) {
						busyChair++;
					}
				}
			}
		} else {
			throw new IllegalArgumentException("Avalilable chairs is not available in this moment");
		}
		return busyChair;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Cinema(Movie movie, int ticketCost) {
		super();
		this.movie = movie;
		this.ticketCost = ticketCost;
	}

	@Override
	public String toString() {
		return "Cinema [movie=" + movie + ", ticketCost=" + ticketCost + "]";
	}

}
