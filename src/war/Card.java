package war;

public class Card {
	
	private Suit cardSuit;
	private Rank cardRank;
	private int cardValue;
	 
	public Card(Rank cardRank, Suit cardSuit){
		
		setCardSuit(cardSuit);
		setCardRank(cardRank);
		setCardValue(cardRank.getValueOfRank() );
	}
	
	public Rank getCardRank() {
		
		return cardRank;
	}

	public void setCardRank(Rank cardRank) {
		
		this.cardRank = cardRank;
	}
	
	public Suit getCardSuit() {
		
		return cardSuit;
	}

	public void setCardSuit(Suit cardSuit) {
		
		this.cardSuit = cardSuit;
	}

	public int getCardValue() {
		
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		
		this.cardValue = cardValue;
	}
	
	public String toString(){
		
		return cardRank.getStringOfRank() + " of "  + cardSuit.stringOfSuit();
		
	}
}
