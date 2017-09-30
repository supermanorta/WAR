package war;

public enum Suit {
	
	CLUBS("Clubs"),
	DIAMONDS("Diamonds"),
	HEARTS("Hearts"),
	SPADES("Spades");
	

	private String suit;
	
	Suit(String suit){
		this.suit = suit;
	}
	
	public String stringOfSuit(){
		return suit;
	}

}