package war;

public class Player {
	
	String name;
	static int score;  
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
	public void updateScore(int pointsToBeAdded){
		this.score += pointsToBeAdded;
	}
	public int getScore(){
		return this.score;
	}
	public void setMainPile( Pile mainPile) {
		this.playersMainPile = mainPile;
	}

	public Pile getPlayersMainPile() {
		return playersMainPile;
	}

	public void setPlayersMainPile(Pile playersMainPile) {
		this.playersMainPile = playersMainPile;
	}

	public int getSizeOfFaceUpPile() {
		//playerOne.getFaceUpPile().sizeOfPile()
		return this.faceUpPile.sizeOfPile();
	}
	public Pile getFaceUpPile() {
		return faceUpPile;
	}
	public int getFaceUpPileValue() {
		//one.faceUpPile.drawCardFromTop().getCardValue()
		return faceUpPile.drawCardFromTop().getCardValue();
	}

	public void setFaceUpPile(Pile faceUpPile) {
		this.faceUpPile = faceUpPile;
	}

	public int getFaceDownPileValue() {
		return faceDownPile.drawCardFromTop().getCardValue();
	}
	
	public Pile getFaceDownPile() {
		return faceDownPile;
	}

	public void setFaceDownPile(Pile faceDownPile) {
		this.faceDownPile = faceDownPile;
	}
	
}
