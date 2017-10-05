package war;

/**
 * The Suit class defines an enumeration of
 * suits used in a Card.
 * 
 * @author Team
 * @version 1.0
 */

public enum Suit {
	
	/**
	 * The different Suits
	 */
	CLUBS("Clubs"),
	DIAMONDS("Diamonds"),
	HEARTS("Hearts"),
	SPADES("Spades");
	
	/**
	 * The suit
	 */
	private String suit;
	
	/**
	 * Constructs a Suit object with a suit.
	 * @param suit
	 */
	Suit(String suit){
		
		this.suit = suit;
	}
	
	/**
	 * Returns the suit.
	 * @return A String specifying the suit
	 */
	public String stringOfSuit(){
		
		return suit;
	}
 
}