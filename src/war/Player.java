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
	
	public void setPlayersMainPile(Pile playersMainPile) {
		this.playersMainPile = playersMainPile;
	}

	public Pile getPlayersMainPile() {
		return playersMainPile;
	}
	public void getPlayersMainPileCardSetCardBottom(Pile winner) {
		this.playersMainPile.addCardToBottom( winner.drawCardFromTop()  );
	}
	public int getPlayersMainPileValue() {
		return this.playersMainPile.drawCardFromTop().getCardValue();
//		return this.playersMainPile.drawCardFromTop().getCardValue();
	}
	
	/*
	 public Card getPlayerCard() {
		return null;
	}
	*/
	
	public Card getPlayersMainCard() {
		return this.playersMainPile.drawCardFromTop();
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
	/***
	 * Takes a Card and adds it ot the bottom of a face Up Pile 
	 * @param card
	 */
	public void addCardToFaceUpPile(Card card) {
		this.faceUpPile.addCardToBottom(card);
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
