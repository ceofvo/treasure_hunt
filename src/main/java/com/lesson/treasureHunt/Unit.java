package com.lesson.treasureHunt;

import java.util.Random;

public class Unit {
	 private String name;
	 private int xPosition;
	 private int yPosition;
	 private String character;
	 
	 public Unit() {
		 this.name = "Unit";
		 this.xPosition = 0;
		 this.yPosition = 0;
	}

	 // Getter methods
	 public String getCharacter() {
		 return character;
	 }
	 
	 public String getName() {
		 return name;
	 }
		  
	 public int getXPosition() {
		 return xPosition;
	 }
	 
	 public int getYPosition() {
		 return yPosition;
	 }
	 
	 // Setter methods
	 public void setCharacter(String character) {
		 this.character = character;
	 }
	 
	 public void setName(String name) {
		  this.name = name;
	}
	 
	 public void setXPosition(int xPosition) {
		 // TO DO: if statement to check if out of bounds
		  this.xPosition = xPosition;
		 }
	 
	 public void setYPosition(int yPosition) {
		 // TO DO: if statement to check if out of bounds
		  this.yPosition = yPosition;
		 }
	 
	 // Other methods
	 public int randomLocation(int size) {
		 Random rand = new Random();
		 int location = rand.nextInt(size);

		 return location;
		}
	 
	 public void setRandomLocation(int size) {
		 int randomX = randomLocation(size);
		 int randomY = randomLocation(size);

		 setXPosition(randomX);
		 setYPosition(randomY);
	 }
	 
	 public void moveLeft(Grid grid) {
		 if (this.xPosition > 0) {
			 grid.updateGrid(this.xPosition, this.yPosition, "X");
			 this.xPosition -= 1;
			 grid.updateGrid(this.xPosition, this.yPosition, this.getCharacter());
			 System.out.println(this.name + " moved left.");
		 }
		 else {
			 System.out.println("You cannot move further left.");
		 }
	 }
	 
	 public void moveRight(Grid grid) {
		 if (this.xPosition < (grid.getSize() - 1)) {
			 grid.updateGrid(this.xPosition, this.yPosition, "X");
			 this.xPosition += 1;
			 grid.updateGrid(this.xPosition, this.yPosition, this.getCharacter());
			 System.out.println(this.name + " moved right.");
		 }
		 else {
			 System.out.println("You cannot move further right.");
		 }
	 }
	 
	 public void moveUp(Grid grid) {
		 if (this.yPosition < 0) {
			 grid.updateGrid(this.xPosition, this.yPosition, "Y");
			 this.yPosition += 1;
			 grid.updateGrid(this.xPosition, this.yPosition, this.getCharacter());
			 System.out.println(this.name + " moved up.");
		 }
		 else {
			 System.out.println("You cannot move further up.");
		 }
	 }
	 
	 public void moveDown(Grid grid) {
		 if (this.yPosition < (grid.getSize() - 1)) {
			 grid.updateGrid(this.xPosition, this.yPosition, "X");
			 this.yPosition -= 1;
			 grid.updateGrid(this.xPosition, this.yPosition, this.getCharacter());
			 System.out.println(this.name + " moved down.");
		 }
		 else {
			 System.out.println("You cannot move further down.");
		 }
	 }
	 
	 
}
