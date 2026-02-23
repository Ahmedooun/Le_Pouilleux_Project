package Pouilleux;

import java.util.*;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Pouilleux.Pcards.Item;

public class Game {

	private int currentPlayer;
	private String[] playerIds;
	
	GameStage gameStage;
	
	Menu menu;
	
	private Pdeck deck;
	ArrayList<ArrayList<Pcards>> playerHand;
	private ArrayList<Pcards> stockpile1;
	private ArrayList<Pcards> stockpile2;
	//private String[] card;
	
	private Pcards.Item validItem;
	private Pcards.Value validValue;
	
	public Game(String[] pids) {
		deck = new Pdeck();
		deck.reset();
		deck.shuffle();
		
		stockpile1 = new ArrayList<Pcards>();
		stockpile2 = new ArrayList<Pcards>();
		
		playerIds = pids;
		currentPlayer = 0;
		
		playerHand = new ArrayList<ArrayList<Pcards>>();
		
		if(pids.length==2) {
			ArrayList<Pcards> hand = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(25)));
			playerHand.add(hand);
			ArrayList<Pcards> hand1 = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(26)));
			playerHand.add(hand1);
		}
		if(pids.length==3) {
			ArrayList<Pcards> hand = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(17)));
			playerHand.add(hand);
			ArrayList<Pcards> hand1 = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(17)));
			playerHand.add(hand1);
			ArrayList<Pcards> hand2 = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(17)));
			playerHand.add(hand2);
		}
		if(pids.length==4) {
			ArrayList<Pcards> hand = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(12)));
			playerHand.add(hand);
			ArrayList<Pcards> hand1 = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(13)));
			playerHand.add(hand1);
			ArrayList<Pcards> hand2 = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(13)));
			playerHand.add(hand2);
			ArrayList<Pcards> hand3 = new ArrayList<Pcards>(Arrays.asList(deck.drawCard(13)));
			playerHand.add(hand3);
		}
	}
	
	/*public Pcards getTopCard() {
		return new Pcards(validItem, validValue);
	}*/
	
	public ImageIcon getTopCardImage(Pcards card) {
		return new ImageIcon(card.getItem() + "_" + card.getValue() + ".png");
	}
	
	public String getCurrentPlayer() {
		return this.playerIds[this.currentPlayer];
	}
	
	public String getNextPlayer() {
		int index = (this.currentPlayer + 1) % this.playerIds.length;
		return this.playerIds[index];
		
	}
	
	public int getNextPlayers() {
		int index = (this.currentPlayer + 1) % this.playerIds.length;
		return index;
	}
	
	public String getPreviousPlayer(int i) {
		int index = this.currentPlayer - i;
		if(index==-1) {
			index = playerIds.length - 1;
		}
		return this.playerIds[index];
	}
	
	public String[] getPlayers() {
		return this.playerIds;
	}
	
	public int getTotalPlayer() {
		return this.playerIds.length;
	}
	
	public ArrayList<Pcards> getPlayerHand(String pid){
		int index = Arrays.asList(playerIds).indexOf(pid);
		return playerHand.get(index);
	}
	
	public int getPlayerHandSize(String pid) {
		return getPlayerHand(pid).size();
	}
	
	public Pcards getPlayerCard(String pid, int choice) {
		ArrayList<Pcards> hand = getPlayerHand(pid);
		return hand.get(choice);
	}
	
	public boolean hasEmptyHand(String pid) {
		return getPlayerHand(pid).isEmpty(); 
	}
	
	public boolean validCardPlay(Pcards card) {
		if(card.getValue() != validValue) {
			return false;
		}

		if(card.getItem() == Item.Clubs && validItem == Item.Spades) {
			return true;
		}else if(card.getItem() == Item.Spades && validItem == Item.Clubs) {
			return true;
		}else if(card.getItem() == Item.Hearts && validItem == Item.Tiles) {
			return true;
		}else if(card.getItem() == Item.Tiles && validItem == Item.Hearts) {
			return true;
		}
		return false;
	}
	
	/*public String[] convertList() {
		String[] card = null;
		for(int i=0; i<this.playerHand.size();i++) {
			card[i] = this.getPlayerCard(getCurrentPlayer(), i).toString();
			//card[i] = this.getPlayerHand(this.getCurrentPlayer()).get(i).toString();
		}
		return card;
	}*/
	
	public String[] convertList(List<Pcards> main) {
	    String[] nomsCartes = new String[main.size()];
	    
	    for (int i = 0; i < main.size(); i++) {
	        Pcards carte = main.get(i);
	        if(carte != null) {
	        	String nom = carte.toString();
		        nomsCartes[i] = nom;
	        }else {
	        	nomsCartes[i] = "Zero_Zero";
	        }
	    }

	    return nomsCartes;
	}
	
	public void getChoiceCard(int index, ArrayList<Pcards> pHand1, ArrayList<Pcards> pHand2) {
	
		Pcards temp = pHand2.get(index);
		pHand2.remove(index);
		pHand1.add(temp);
		
		JLabel message = new JLabel("You choose the " + temp.getValue() + " of " + temp.getItem());
		message.setFont(new Font("Arial", Font.BOLD, 30));
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void nextPlayer(String pid) {
		currentPlayer = (currentPlayer + 1)%playerIds.length;
		JLabel message = new JLabel(this.playerIds[currentPlayer] + "'s turn !");
		message.setFont(new Font("Arial", Font.BOLD, 30));
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void removePlayer() {
		String[] temp = playerIds;
		List<String> list = new ArrayList<>(Arrays.asList(temp));
		list.remove(this.getCurrentPlayer());
		playerIds = list.toArray(new String[0]);
	}
	
	public void playerWon(String pid) {
		ArrayList<Pcards> pHand = getPlayerHand(pid);
		
		if(hasEmptyHand(pid)) {
			JLabel mes = new JLabel(this.getCurrentPlayer() + " is the LOOSER !");
			mes.setFont(new Font("Arial", Font.BOLD, 30));
			JOptionPane.showMessageDialog(null, mes);
			JLabel message = new JLabel(this.getNextPlayer() + " won, congrulation !");
			message.setFont(new Font("Arial", Font.BOLD, 30));
			JOptionPane.showMessageDialog(null, message);
			
			//this.currentPlayer = (this.currentPlayer + 1) % this.playerIds.length;
			playerHand.remove(pHand);
			String[] temp = playerIds;
			List<String> list = new ArrayList<>(Arrays.asList(temp));
			list.remove(this.getNextPlayer());
			playerIds = list.toArray(new String[0]);
			
			
			if(playerIds.length == 1) {
				JLabel mess = new JLabel("END, Thanks for playing !");
				mess.setFont(new Font("Arial", Font.BOLD, 30));
				JOptionPane.showMessageDialog(null, mess);
				menu = new Menu();
				menu.setVisible(true);
			}
		}
	}
	
	public void submitPlayerCard(String pid, Pcards card1, Pcards card2, GameStage gameStage) throws InvalidPlaySubmissionException {
		
		ArrayList<Pcards> pHand = getPlayerHand(pid);
		
		this.gameStage = gameStage;
		
		validItem = card1.getItem();
		validValue = card1.getValue();
		
		if(!validCardPlay(card2)) {
			JLabel message = new JLabel("Invalid player move, these cards are not a pairs, be careful !");
			message.setFont(new Font("Arial", Font.BOLD, 30));
			JOptionPane.showMessageDialog(null, message);
			String mes = message.getText();
			throw new InvalidPlaySubmissionException(mes);
		}
		
		pHand.remove(card1);
		pHand.remove(card2);
		
		if(hasEmptyHand(pid)) {
			JLabel message = new JLabel(this.playerIds[currentPlayer] + " won, congrulation !");
			message.setFont(new Font("Arial", Font.BOLD, 30));
			JOptionPane.showMessageDialog(null, message);
			
			//this.currentPlayer = (this.currentPlayer + 1) % this.playerIds.length;
			playerHand.remove(pHand);
			String[] temp = playerIds;
			List<String> list = new ArrayList<>(Arrays.asList(temp));
			list.remove(this.getCurrentPlayer());
			playerIds = list.toArray(new String[0]);
			
			
			if(playerIds.length == 1) {
				JLabel mes = new JLabel(this.getCurrentPlayer() + " is the LOOSER !");
				mes.setFont(new Font("Arial", Font.BOLD, 30));
				JOptionPane.showMessageDialog(null, mes);
				JLabel mess = new JLabel("END, Thanks for playing !");
				mess.setFont(new Font("Arial", Font.BOLD, 30));
				JOptionPane.showMessageDialog(null, mess);
				menu = new Menu();
				menu.setVisible(true);
			}
			gameStage.btnChooseCards.setVisible(true);
		}
		
		stockpile1.add(card1);
		stockpile2.add(card2);
		
	}
	
}

class InvalidPlaySubmissionException extends Exception {
	public InvalidPlaySubmissionException(String message) {}
}



