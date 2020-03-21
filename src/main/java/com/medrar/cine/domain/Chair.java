package com.medrar.cine.domain;

public class Chair {

	private String row;
	private String column;
	private boolean busy;

	public Chair() {
		row = new String();
		column = new String();
		busy = false;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	@Override
	public String toString() {
		return "Chair [row=" + row + ", column=" + column + ", busy=" + busy + "]";
	}

}
