package war;

/**
 * The Card class defines a Card object that has a suit,
 * rank, and value.
 * 
 * @author Team Livin the Dream
 * @version 1.0
 *
 */

public class Card {
	
	/**
	 * The suit of this card
	 */
	private Suit cardSuit;
	
	/**
	 * The rank of this card
	 */
	private Rank cardRank;
	
	/**
	 * The value of this card
	 */
	private int cardValue;
	 
	/**
	 * Constructs a Card object with a rank and a suit.
	 * @param cardRank The rank for this card
	 * @param cardSuit The suit for this card
	 */
	public Card(Rank cardRank, Suit cardSuit){
		
		setCardSuit(cardSuit);
		setCardRank(cardRank);
		setCardValue(cardRank.getValueOfRank() );
	}
	
	/**
	 * Returns the rank of this card.
	 * @return A Rank specifying the rank
	 */
	public Rank getCardRank() {
		
		return cardRank;
	}

	/**
	 * Changes the rank of this card.
	 * @param cardRank The new rank for this card
	 */
	public void setCardRank(Rank cardRank) {
		
		this.cardRank = cardRank;
	}
	
	/**
	 * Returns the suit of this card.
	 * @return A Suit specifying the suit
	 */
	public Suit getCardSuit() {
		
		return cardSuit;
	}

	/**
	 * Changes the suit of this card.
	 * @param cardSuit The new suit for this card
	 */
	public void setCardSuit(Suit cardSuit) {
		
		this.cardSuit = cardSuit;
	}

	/**
	 * Returns the value of this card.
	 * @return A int specifying the value
	 */
	public int getCardValue() {
		
		return cardValue;
	}

	/**
	 * Changes the value of this card.
	 * @param cardValue The new value of this card
	 */
	public void setCardValue(int cardValue) {
		
		this.cardValue = cardValue;
	}
	
	/**
	 * Returns a String representation of this Card object.
	 * @return A String specifying this object
	 */
	public String toString(){
		
		return cardRank.getStringOfRank() + " of "  + cardSuit.stringOfSuit();
		
	}
}
