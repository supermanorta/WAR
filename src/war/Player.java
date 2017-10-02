package war;

public class Player {
	String name;
	int score;  
	Pile playersMainPile; // again these are prefab names, this could also be gamePile or pulled From pile etc
	Pile faceUpPile;
	Pile faceDownPile;    // or burnPile;
	
	public Player(String neoName){
		this.name = neoName;
		this.score = 0;
		this.playersMainPile = new Pile();
		this.faceDownPile    = new Pile();
		this.faceUpPile      = new Pile();
	}
	
	public Player(){
		this.name = "no name";
		this.score = 0;
		this.playersMainPile = new Pile();
		this.faceDownPile    = new Pile();
		this.faceUpPile      = new Pile();
	}


}
