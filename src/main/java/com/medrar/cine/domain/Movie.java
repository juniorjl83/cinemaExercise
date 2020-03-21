package com.medrar.cine.domain;

public class Movie {

	private String title;
	private int durationInMinutes;
	private int minimumAge;
	private String directorName;
	private Chair[][] chairs = new Chair[8][9];
	private String[] columnsLetter = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };

	public Movie() {
		generateChairValues();
	}

	private void generateChairValues() {
		for (int row = 0; row < chairs.length; row++) {
			for (int col = 0; col < chairs[row].length; col++) {
				chairs[row][col] = new Chair();
				chairs[row][col].setColumn(columnsLetter[col]);
				chairs[row][col].setRow(String.valueOf(8 - row));
			}

		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public int getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", durationInMinutes=" + durationInMinutes + ", minimumAge=" + minimumAge
				+ ", directorName=" + directorName + "]";
	}

	public Chair[][] getChairs() {
		return chairs;
	}

}
