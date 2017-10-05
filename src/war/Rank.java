package war;

/**
 * The Rank class defines an enumeration of 
 * the ranks used on a Card.
 * 
 * @author Team
 * @version 1.0
 */

public enum Rank {
	
	/**
	 * The different Ranks
	 */
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
	
	/**
	 * The value of this rank
	 */
	private final int value;
	
	/**
	 * The rank
	 */
	private final String rank;
	
	/**
	 * Constructs a Rank object with a value and a rank.
	 * @param value
	 * @param rank
	 */
	Rank(int value, String rank){
		this.value = value;
		this.rank = rank;
	}
	
	/**
	 * Returns the value of this rank.
	 * @return An int specifying the value
	 */
	public int getValueOfRank(){
		return value;
	}
	
	/**
	 * Returns the String rank.
	 * @return A String specifying the rank
	 */
	public String getStringOfRank(){
		return rank;
	}
}