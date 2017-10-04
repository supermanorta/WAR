package war;

public class GameTwo extends GameOne {
	
	public Player playerOne = new Player("Zack");
	public Player playerTwo = new Player("Bill");
	public final int orginalDeckSize  = 52;
	public Deck mainDeck = new Deck(); 

	public void setUpGame(){
		
		mainDeck.fillDeckContents();
		mainDeck.shuffleDeckContents();
		dealCardsToPlayers(playerOne, playerTwo);
		
		playerOne.playersMainPile.printDeckContents();
		System.out.println();
		playerTwo.playersMainPile.printDeckContents();
		System.out.println();
		addToFaceUpPile(playerOne);
		playerOne.faceUpPile.printDeckContents();
		addToFaceUpPile(playerTwo);
		playerTwo.faceUpPile.printDeckContents();
		
	}
	
	public void dealCardsToPlayers(Player playerOne, Player playerTwo){
		for(int singleCard = 0; singleCard < orginalDeckSize; singleCard++){
			
			if(singleCard % 2 == 0){
				playerOne.playersMainPile.addCardToTopOfPile(mainDeck.drawCardFromTop());
			}
			else{
				playerTwo.playersMainPile.addCardToTopOfPile(mainDeck.drawCardFromTop());
			}
		}
	}
	
	public void addToFaceUpPile(Player player){
		
		player.faceUpPile.addCardToTopOfPile(player.playersMainPile.drawCardFromTop());
	}
	
	public void addToFaceDownPile(Player player){
	
		player.faceDownPile.addCardToTopOfPile(player.playersMainPile.drawCardFromTop());
	}
	public void compareTo() {
		
	}
}
