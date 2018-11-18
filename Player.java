package com.cog.InfinateSwamp;

public class Player {

	private int xPosition;
	private int yPosition;

	public Player(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public void goNorth() {
		yPosition = yPosition + 1;
	}

	public void goSouth() {
		yPosition = yPosition - 1;
	}

	public void goEast() {
		xPosition = xPosition + 1;
	}

	public void goWest() {
		xPosition = xPosition - 1;
	}
}
