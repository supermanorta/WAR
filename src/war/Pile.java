package war;

/**
 * The Pile class defines a Pile object
 * that extends a Deck.
 * 
 * @author Team
 * @version 1.0
 */

public class Pile extends Deck{
	
	/**
	 * Adds a card to the bottom of the Pile. Or 
	 * to the last index of the list that makes up this Pile.
	 * @param wonCard The card to be added to the bottom
	 */
	public void addCardToBottom(Card wonCard){
		
		cardDeck.add(cardDeck.size(), wonCard);
	
	}
	
	/**
	 * Adds a card to the bottom of the Pile. Or to
	 * the last index of this list that makes up this Pile.
	 * @param drawnCard The card to be added to the bottom
	 */
	public void addCardToTopOfPile(Card drawnCard){
		
		cardDeck.add(drawnCard);
	}
	
	/**
	 * Returns the size of this Pile.
	 * @return An int specifying the size of this Pile
	 */
	public int sizeOfPile() {
		
		return cardDeck.size();
	}
	

}
