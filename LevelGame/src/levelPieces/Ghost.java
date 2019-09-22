package levelPieces;
import gameEngine.GameEngine;
import java.util.Random;
import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;


public class Ghost extends GamePiece implements Moveable {
	Random rand = new Random();
	private char symbol;
	private int location;
	private int oldLocation;
	private int newLocation;
	
	public Ghost(char symbol, int location) {
		super(symbol, location);
		this.symbol = symbol;
		this.location = location;
	}
	

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == this.newLocation) {return InteractionResult.HIT;}
		else {return InteractionResult.NONE;}
		
	}

	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		oldLocation = this.location;
		newLocation = rand.nextInt(7) + 13; // warrior in random locations before the door so it makes it slightly harder to pass
		this.location = newLocation;
		Ghost newGhost = new Ghost('G', oldLocation);
		newGhost.location = newLocation;
		gameBoard[oldLocation] = null;
		gameBoard[newLocation] = newGhost;
	}
	
	
	public void draw() {
		System.out.print(this.symbol);
	}

	
}
