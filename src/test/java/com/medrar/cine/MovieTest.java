package com.medrar.cine;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.medrar.cine.domain.Movie;

public class MovieTest {

	@Test
	public void newMovieChairsValuesTest() {
		Movie movie = new Movie();
		assertTrue(movie.getChairs()[0][0].getColumn().equals("A"));
		assertTrue(movie.getChairs()[0][0].getRow().equals("8"));
		assertFalse(movie.getChairs()[0][0].isBusy());
		
		assertTrue(movie.getChairs()[1][1].getColumn().equals("B"));
		assertTrue(movie.getChairs()[1][1].getRow().equals("7"));
		assertFalse(movie.getChairs()[1][1].isBusy());
		
		assertTrue(movie.getChairs()[7][8].getColumn().equals("I"));
		assertTrue(movie.getChairs()[7][8].getRow().equals("1"));
		assertFalse(movie.getChairs()[7][8].isBusy());
	}
	
}
