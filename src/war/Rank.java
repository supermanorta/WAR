package war;
public enum Rank {
	
	TWO(2, "Two"),
	THREE(3, "Three"),
	FOUR(4, "Four"),
	FIVE(5, "Five"),
	SIX(6, "Six"),
	SEVEN(7, "Seven"),
	EIGHT(8, "Eight"),
	NINE(9, "Nine"),
	TEN(10, "Ten"),
	JACK(11, "Jack"),
	QUEEN(12, "Queen"),
	KING(13, "King"),
	ACE(14, "Ace");
	
	private final int value;
	private final String rank;
	
	Rank(int value, String rank){
		this.value = value;
		this.rank = rank;
	}
	
	public int valueOfRank(){
		return value;
	}
	
	public String stringOfRank(){
		return rank;
	}

}