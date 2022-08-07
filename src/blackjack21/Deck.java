package blackjack21;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards;
	
	//생성
	public Deck() {
		this.cards = new ArrayList<Card>();
	}
	
	public void createFullDeck() {
		for(Suit cardSuit : Suit.values()) {
			for(Value cardValue : Value.values()) {
				//Add a new card to the mix
				this.cards.add(new Card(cardSuit,cardValue));
			}
		}
	}
}
