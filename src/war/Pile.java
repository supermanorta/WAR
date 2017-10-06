package war;

import java.util.ArrayList;

public class Pile extends Deck{
	
	public void addCardToBottom(Card wonCard){
		
//old version		cardDeck.add(cardDeck.size(), wonCard);
		cardDeck.add( wonCard );// the arraylist will add the card to the top, we dont have to tell it that.
	
	}
	
	public void addCardToTopOfPile(Card drawnCard){
		
		cardDeck.add(drawnCard);
	}
	
	public int sizeOfPile() {
		
		return cardDeck.size();
	}
	

}
