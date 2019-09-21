package levelPieces;

import gameEngine.GameEngine;
import java.util.Random;
import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;



public class Warrior extends GamePiece implements Moveable {
	Random rand = new Random();
	private char symbol;
	private int location;
	
	
	public Warrior(char symbol, int location) {
		super(symbol, location);
		this.symbol = symbol;
		this.location = location;
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == super.getLocation()) {
			return InteractionResult.HIT;
		}
		else {
			return InteractionResult.NONE;
		}
		
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int oldLocation = this.getLocation();
		int newLocation = rand.nextInt(6)-3 + oldLocation;
		if(newLocation>GameEngine.BOARD_SIZE) {newLocation = newLocation % GameEngine.BOARD_SIZE;}
		else if(newLocation<0) {newLocation = 0;}
		
		Warrior newWarrior = new Warrior('W', newLocation);
		gameBoard[newLocation] = newWarrior;
		gameBoard[oldLocation] = null;
	}
	
	public void draw() {
		System.out.print(this.symbol);
	}

}
