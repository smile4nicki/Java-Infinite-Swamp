package com.cog.InfinateSwamp;

public class Compass {
	
	private int distance;
	private String direction;

	public Compass() {
	}


	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}

	
	public String toString() {
		return "The treasure is " + distance + " miles from here";
	}
}
