package war;

public class GameEngine {
	
	public Player playerOne = new Player("Jack");
	public Player playerTwo = new Player("Jill");

	public Deck mainDeck = new Deck();

	public void setUpGame(){
		
		mainDeck.fillDeckContents();
		mainDeck.shuffleDeckContents();
		dealCardsToPlayers(playerOne, playerTwo);
		
		playerOne.playersMainPile.printDeckContents();
		System.out.println();
		playerTwo.playersMainPile.printDeckContents();
		
		addToFaceUpPile(playerOne);
		playerOne.faceUpPile.printDeckContents();
		addToFaceUpPile(playerTwo);
		playerTwo.faceUpPile.printDeckContents();
		
		
	}
	
	public void dealCardsToPlayers(Player playerOne, Player playerTwo){
		
		for(int i = 0; i < 52; i++){
			
			if(i % 2 == 0){
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
	
	

}
