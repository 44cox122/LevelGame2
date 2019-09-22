package levelPieces;

import gameEngine.GameEngine;
import java.util.Random;
import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;


public class Warrior extends GamePiece implements Drawable {
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
		if(playerLocation == this.location) {return InteractionResult.HIT;}
		else {return InteractionResult.NONE;}		
	}


	public void draw() {
		System.out.print(this.symbol);
	}

	
}
