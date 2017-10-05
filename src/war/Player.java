package war;

/**
 * The Player class defines a Player class that
 * has a name, score, a main pile, a face up pile of cards,
 * and a face down pile of cards.
 * 
 * @author Team
 * @version 1.0
 */

public class Player {
	
	/**
	 * The name of this Player
	 */
	String name;
	
	/**
	 * The score of this player
	 */
	static int score;
	
	/**
	 * This player's main pile of cards
	 */
	Pile playersMainPile; // again these are prefab names, this could also be gamePile or pulled From pile etc
	
	/**
	 * The face up pile of cards
	 */
	Pile faceUpPile;

	/**
	 * The face down pile of cards
	 */
	Pile faceDownPile;    // or burnPile;
	
	/**
	 * Constructs a Player with a name.
	 * @param neoName The name of this player
	 */
	public Player(String neoName){
		
		this.name = neoName;
		this.score = 0;
		this.playersMainPile = new Pile();
		this.faceDownPile    = new Pile();
		this.faceUpPile      = new Pile();
	}
	
	/**
	 * Constructs a Player with default values.
	 */
	public Player(){
		
		this.name = "no name";
		this.score = 0;
		this.playersMainPile = new Pile();
		this.faceDownPile    = new Pile();
		this.faceUpPile      = new Pile();
	}
	
	/**
	 * Updates the score of this player.
	 * @param pointsToBeAdded The points to add to this player's score
	 */
	public void updateScore(int pointsToBeAdded){
		this.score += pointsToBeAdded;
	}
	
	/**
	 * Returns the score of this player.
	 * @return A int specifying the score
	 */
	public int getScore(){
		return this.score;
	}

	/**
	 * Return the main pile of this player.
	 * @return A Pile specifying this player's main pile
	 */
	public Pile getPlayersMainPile() {
		return playersMainPile;
	}

	/**
	 * Changes the main pile of this Player.
	 * @param playersMainPile The new main pile for this player
	 */
	public void setPlayersMainPile(Pile playersMainPile) {
		this.playersMainPile = playersMainPile;
	}

	/**
	 * Returns the size of the face up pile.
	 * @return An int specifying the size of face up pile
	 */
	public int getSizeOfFaceUpPile() {
		//playerOne.getFaceUpPile().sizeOfPile()
		return this.faceUpPile.sizeOfPile();
	}
	
	/**
	 * Returns the face up Pile of this player.
	 * @return A Pile specifying the face up pile
	 */
	public Pile getFaceUpPile() {
		return faceUpPile;
	}
	
	/**
	 * Returns the value of the face up Pile of this player.
	 * @return An int specifying the value of the face up pile
	 */
	public int getFaceUpPileValue() {
		//one.faceUpPile.drawCardFromTop().getCardValue()
		return faceUpPile.drawCardFromTop().getCardValue();
	}

	/**
	 * Changes the face up Pile of this player.
	 * @param faceUpPile The new face up Pile
	 */
	public void setFaceUpPile(Pile faceUpPile) {
		this.faceUpPile = faceUpPile;
	}

	/**
	 * Return the value of the face down Pile of this player.
	 * @return An int specifying the value of the face down pile
	 */
	public int getFaceDownPileValue() {
		return faceDownPile.drawCardFromTop().getCardValue();
	}
	
	/**
	 * Returns the Pile of face down cards of this player.
	 * @return A Pile specifying the face down pile
	 */
	public Pile getFaceDownPile() {
		return faceDownPile;
	}

	/**
	 * Changes the face down Pile of this player.
	 * @param faceDownPile The new face down Pile
	 */
	public void setFaceDownPile(Pile faceDownPile) {
		this.faceDownPile = faceDownPile;
	}
	
}
