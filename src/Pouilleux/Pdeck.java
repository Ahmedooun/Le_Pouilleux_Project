package Pouilleux;

import java.util.*;

import javax.swing.ImageIcon;

import Pouilleux.Pcards.Item;
import Pouilleux.Pcards.Value;
//import java.awt.*;

public class Pdeck {

	private Pcards[] cards;
	private int cardsInDeck;
	
	public Pdeck() {
		
		cards = new Pcards[51];

	}
	
	public void reset() {
		
		Pcards.Item[] items = Pcards.Item.values();
		cardsInDeck = 0;
		
		for(int i = 0; i < items.length; i++) {
			
			Pcards.Item item = items[i];
			
			for(int j = 0; j < 10; j++) {
				
				cards[cardsInDeck++] = new Pcards(item, Pcards.Value.getValue(j));
			}
			
			Pcards.Value[] values = new Pcards.Value[] {Pcards.Value.Queen, Pcards.Value.King};
			
			for(Pcards.Value value : values) {
				
				cards[cardsInDeck++] = new Pcards(item, value);
			}
		}
		cards[cardsInDeck++] = new Pcards(Item.Hearts, Value.Jack);
		cards[cardsInDeck++] = new Pcards(Item.Spades, Value.Jack);
		cards[cardsInDeck++] = new Pcards(Item.Tiles, Value.Jack);
		
	}
	
	
	public boolean isEmpty() {
		return cardsInDeck == 0;
	}
	
	public void shuffle() {
		int n = cards.length;
		Random random = new Random();
		
		for(int i = 0; i < cards.length; i++) {
			int randomValue = i + random.nextInt(n - i);
			Pcards randomCard = cards[randomValue];
			cards[randomValue] = cards[i];
			cards[i] = randomCard;
		}
	}
	
	/*public Pcards[] removeJC(Pcards[] card) {
		List<Pcards> cardList = new ArrayList<>(Arrays.asList(cards));

		// Supposons que PCard a une méthode getValue() et getSuit()
		cardList.removeIf(card -> card.getValue().equals("Jack") && card.getItem().equals("Clubs"));

		// Si tu veux remettre dans un tableau :
		cards = cardList.toArray(new Pcards[0]);
	}*/
	
	public Pcards drawCard() throws IllegalArgumentException {
		if (isEmpty()) {
			throw new IllegalArgumentException("cannot draw a card...");
		}
		return cards[--cardsInDeck];
	}
	
	public ImageIcon drawCardImage() throws IllegalArgumentException {
		if (isEmpty()) {
			throw new IllegalArgumentException("cannot draw a card...deck is empty !");
		}
		return new ImageIcon(cards[--cardsInDeck].toString() + ".png");
	}
	
	public Pcards[] drawCard(int n) {
		if (n<0) {
			throw new IllegalArgumentException("cannot draw " + n + " card");
		}
		
		if (n>cardsInDeck) {
			throw new IllegalArgumentException("cannot draw " + n + " card");
		}
		
		Pcards[] ret = new Pcards[n];
		
		for(int i = 0; i < n; i++) {
			ret[i] = cards[--cardsInDeck];
		}
		return ret;
	}
	
	/*public void displayDeck() {
	    System.out.println("Cartes dans le jeu (" + cardsInDeck + ") :");
	    
	    for(int i = 0; i < cardsInDeck; i++) {
	        Pcards card = cards[i];
	        // Affiche au format "value_item" (ex: "Ace_Hearts")
	        System.out.println(card.getValue() + "_" + card.getItem());
	    }
	}*/
	
}
