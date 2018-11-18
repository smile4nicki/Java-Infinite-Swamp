package com.cog.InfinateSwamp;

public class Treasure {

	private static int xPosition;
	private static int yPosition;
	
	
	public Treasure(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public static int getxPosition() {
		return xPosition;
	}


	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}


	public static int getyPosition() {
		return yPosition;
	}


	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
}

}
