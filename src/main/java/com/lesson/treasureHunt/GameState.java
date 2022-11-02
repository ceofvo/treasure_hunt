package com.lesson.treasureHunt;

import java.util.Scanner;

public class GameState {
	public void startGame() {
		// Generate the grid
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter the grid size: ");
		int size = Integer.parseInt(inputObj.nextLine());		
		Grid g1 = new Grid();
		g1.createGrid(size);
		
		// Generate the objects on the grid
		Player p1 = new Player();
		p1.setRandomLocation(size);
		System.out.println(p1.getXPosition());
		System.out.println(p1.getYPosition());
		
		Treasure t1 = new Treasure();
		t1.setRandomLocation(size);
		System.out.println(t1.getXPosition());
		System.out.println(t1.getYPosition());
		
		Enemy e1 = new Enemy();
		e1.setRandomLocation(size);
		System.out.println(e1.getXPosition());
		System.out.println(e1.getYPosition());		
		
		g1.updateGrid(p1.getXPosition(), p1.getYPosition(), p1.getCharacter());
		g1.updateGrid(t1.getXPosition(), t1.getYPosition(), t1.getCharacter());
		g1.updateGrid(e1.getXPosition(), e1.getYPosition(), e1.getCharacter());
		g1.showGrid(size);
		
		g1.calculateDistance(p1, t1);
		
		p1.moveLeft(g1);
		p1.moveLeft(g1);
		p1.moveLeft(g1);
		p1.moveLeft(g1);
		p1.moveLeft(g1);
		
		g1.updateGrid(p1.getXPosition(), p1.getYPosition(), p1.getCharacter());
		g1.updateGrid(t1.getXPosition(), t1.getYPosition(), t1.getCharacter());
		g1.updateGrid(e1.getXPosition(), e1.getYPosition(), e1.getCharacter());
		g1.showGrid(size);
		
		g1.calculateDistance(p1, t1);
	}
}
