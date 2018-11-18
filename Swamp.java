package com.cog.InfinateSwamp;

import java.util.Scanner;

public class Swamp {
	public static void main(String[] args) {

		Player player1 = new Player(30, 30);
		Scanner scan = new Scanner(System.in);
		Compass compass = new Compass();

		System.out.println(compass.toString());

		while (player1.getxPosition() != Treasure.getxPosition() && player1.getyPosition() != Treasure.getyPosition()) {

			String walk = scan.nextLine();
			System.out.println("Choose North, South, East, West");
			switch (walk) {
			case "North":
				player1.goNorth();
				break;
			case "East":
				player1.goEast();
				break;
			case "South":
				player1.goSouth();
				break;
			case "West":
				player1.goWest();
				break;

			}
		}
	}
	
}
