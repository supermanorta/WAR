package war;

public class Pile extends Deck{
	
	public void addCardToBottom(Card wonCard){
		
		cardDeck.add(cardDeck.size(), wonCard);
	
	}
	
	public void addCardToTopOfPile(Card drawnCard){
		
		cardDeck.add(drawnCard);
	}
	

}
