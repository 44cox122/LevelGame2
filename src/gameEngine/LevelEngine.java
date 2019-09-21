package gameEngine;

import java.util.ArrayList;
import gameEngine.GameEngine;

import levelPieces.Door;
import levelPieces.GamePiece;
import levelPieces.Nuke;
import levelPieces.Rock;
import levelPieces.Treasure;
import levelPieces.Warrior;


public class LevelEngine {
	public Drawable[] myGameBoard = new Drawable[GameEngine.BOARD_SIZE];
	private ArrayList<Moveable> myMoveable = new ArrayList<Moveable>();
	private ArrayList<GamePiece> myInteracting = new ArrayList<GamePiece>();
	int myLevel;
	Warrior p1;
	Door p2;
	Treasure p3;
	Rock p4;
	Nuke p5;
	
	public LevelEngine() {
		super();
	}

	public void createLevel(int levelNum) {
		myLevel = levelNum;	
		Warrior p1 = new Warrior('W', GameEngine.BOARD_SIZE/2);
		Door p2 = new Door();
		Treasure p3 = new Treasure();
		Rock p4 = new Rock();
		
		if(levelNum > 1) {
			Nuke p5 = new Nuke();
			myGameBoard[p5.getLocation()] = p5;
		}
		
		myGameBoard[p1.getLocation()] = p1;
		myGameBoard[p2.getLocation()] = p2;
		myGameBoard[p3.getLocation()] = p3;
		myGameBoard[12] = p4;	
		
		this.myInteracting.add((GamePiece)p1);
		this.myInteracting.add((GamePiece)p2);
		this.myInteracting.add((GamePiece)p3);
		if(myLevel > 1) {
			this.myInteracting.add((GamePiece) p5);
		}
		this.myMoveable.add((Moveable) p1);
		this.myMoveable.add((Moveable) p3);
		
	}

	public Drawable[] getBoard() {
		return myGameBoard;
	}

	public ArrayList<Moveable> getMovingPieces() {
		return this.myMoveable;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		return this.myInteracting;
	}

	public int getPlayerStartLoc() {

		return 0;
	}

}
