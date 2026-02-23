package Pouilleux;

import java.awt.EventQueue;
import java.lang.NullPointerException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ChoiceCard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	GameStage gameStage;
	ArrayList<String> temp = new ArrayList<>();
	String[] pids;
	Game game;
	ArrayList<JButton> cardButtons = new ArrayList<>();
	ArrayList<String> cardIds;
	ChoiceCard cc = this;
	
	
	
	private JButton JButton1;
	private JButton JButton2;
	private JButton JButton6;
	private JButton JButton7;
	private JButton JButton8;
	private JButton JButton9;
	private JButton JButton10;
	private JButton JButton3;
	private JButton JButton11;
	private JButton JButton12;
	private JButton JButton13;
	private JButton JButton14;
	private JButton JButton15;
	private JButton JButton16;
	private JButton JButton4;
	private JButton JButton17;
	private JButton JButton18;
	private JButton JButton19;
	private JButton JButton20;
	private JButton JButton21;
	private JButton JButton22;
	private JButton JButton5;
	private JButton JButton23;
	private JButton JButton24;
	private JButton JButton25;
	private JButton JButton26;
	private JButton JButton27;
	private JButton JButton28;
	
	private JLabel lblChooseOneCard;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoiceCard frame = new ChoiceCard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public ChoiceCard() {};//ArrayList<String> playerIds, GameStage gameStage, Game game
	public ChoiceCard(ArrayList<String> playerIds, GameStage gameStage, Game game) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 773);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBackground(new Color(139, 0, 0));
		contentPane_1.setBounds(0, 0, 885, 736);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1);
		
		
		JButton1 = new JButton("");
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(0) != null) {
					game.getChoiceCard(0, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton1.setBounds(23, 90, 100, 140);
		contentPane_1.add(JButton1);
		
		JButton2 = new JButton("");
		JButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(1) != null) {
					game.getChoiceCard(1, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton2.setBounds(145, 90, 100, 140);
		contentPane_1.add(JButton2);
		
		JButton3 = new JButton("");
		JButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(2) != null) {
					game.getChoiceCard(2, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton3.setBounds(272, 90, 100, 140);
		contentPane_1.add(JButton3);
		
		JButton4 = new JButton("");
		JButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(3) != null) {
					game.getChoiceCard(3, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton4.setBounds(395, 90, 100, 140);
		contentPane_1.add(JButton4);
		
		JButton5 = new JButton("");
		JButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(4) != null) {
					game.getChoiceCard(4, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton5.setBounds(517, 90, 100, 140);
		contentPane_1.add(JButton5);
		
		JButton6 = new JButton("");
		JButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(5) != null) {
					game.getChoiceCard(5, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton6.setBounds(640, 90, 100, 140);
		contentPane_1.add(JButton6);
		
		JButton7 = new JButton("");
		JButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(6) != null) {
					game.getChoiceCard(6, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton7.setBounds(763, 90, 100, 140);
		contentPane_1.add(JButton7);
		
		JButton8 = new JButton("");
		JButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(7) != null) {
					game.getChoiceCard(7, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton8.setBounds(23, 240, 100, 140);
		contentPane_1.add(JButton8);
		
		JButton9 = new JButton("");
		JButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(8) != null) {
					game.getChoiceCard(8, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton9.setBounds(145, 240, 100, 140);
		contentPane_1.add(JButton9);
		
		JButton10 = new JButton("");
		JButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(9) != null) {
					game.getChoiceCard(9, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton10.setBounds(272, 240, 100, 140);
		contentPane_1.add(JButton10);
		
		JButton11 = new JButton("");
		JButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(10) != null) {
					game.getChoiceCard(10, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton11.setBounds(395, 240, 100, 140);
		contentPane_1.add(JButton11);
		
		JButton12 = new JButton("");
		JButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(11) != null) {
					game.getChoiceCard(11, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton12.setBounds(517, 240, 100, 140);
		contentPane_1.add(JButton12);
		
		JButton13 = new JButton("");
		JButton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(12) != null) {
					game.getChoiceCard(12, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton13.setBounds(640, 240, 100, 140);
		contentPane_1.add(JButton13);
		
		JButton14 = new JButton("");
		JButton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(13) != null) {
					game.getChoiceCard(13, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton14.setBounds(763, 240, 100, 140);
		contentPane_1.add(JButton14);
		
		JButton15 = new JButton("");
		JButton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(14) != null) {
					game.getChoiceCard(14, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton15.setBounds(23, 390, 100, 140);
		contentPane_1.add(JButton15);
		
		JButton16 = new JButton("");
		JButton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(14) != null) {
					game.getChoiceCard(15, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton16.setBounds(145, 390, 100, 140);
		contentPane_1.add(JButton16);
		
		JButton17 = new JButton("");
		JButton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(16) != null) {
					game.getChoiceCard(16, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton17.setBounds(272, 390, 100, 140);
		contentPane_1.add(JButton17);
		
		JButton18 = new JButton("");
		JButton18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(17) != null) {
					game.getChoiceCard(17, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton18.setBounds(395, 390, 100, 140);
		contentPane_1.add(JButton18);
		
		JButton19 = new JButton("");
		JButton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(18) != null) {
					game.getChoiceCard(18, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton19.setBounds(517, 390, 100, 140);
		contentPane_1.add(JButton19);
		
		JButton20 = new JButton("");
		JButton20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(19) != null) {
					game.getChoiceCard(19, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton20.setBounds(640, 390, 100, 140);
		contentPane_1.add(JButton20);
		
		JButton21 = new JButton("");
		JButton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(20) != null) {
					game.getChoiceCard(20, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton21.setBounds(763, 390, 100, 140);
		contentPane_1.add(JButton21);
		
		JButton22 = new JButton("");
		JButton22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(21) != null) {
					game.getChoiceCard(21, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton22.setBounds(23, 540, 100, 140);
		contentPane_1.add(JButton22);
		
		JButton23 = new JButton("");
		JButton23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(22) != null) {
					game.getChoiceCard(22, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton23.setBounds(145, 540, 100, 140);
		contentPane_1.add(JButton23);
		
		JButton24 = new JButton("");
		JButton24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(23) != null) {
					game.getChoiceCard(23, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton24.setBounds(272, 540, 100, 140);
		contentPane_1.add(JButton24);
		
		JButton25 = new JButton("");
		JButton25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(24) != null) {
					game.getChoiceCard(24, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton25.setBounds(395, 540, 100, 140);
		contentPane_1.add(JButton25);
		
		JButton26 = new JButton("");
		JButton26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(25) != null) {
					game.getChoiceCard(25, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton26.setBounds(517, 540, 100, 140);
		contentPane_1.add(JButton26);
		
		JButton27 = new JButton("");
		JButton27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(26) != null) {
					game.getChoiceCard( 26, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton27.setBounds(640, 540, 100, 140);
		contentPane_1.add(JButton27);
		
		JButton28 = new JButton("");
		JButton28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cardIds.get(27) != null) {
					game.getChoiceCard(27, game.getPlayerHand(game.getCurrentPlayer()), game.getPlayerHand(game.getNextPlayer()));
					game.playerWon(game.getNextPlayer());
					gameStage.setPidName(game.getCurrentPlayer());
					gameStage.setButtonIcons();
					cc.dispose();
				}
			}
		});
		JButton28.setBounds(763, 540, 100, 140);
		contentPane_1.add(JButton28);
		
		lblChooseOneCard = new JLabel("");
		lblChooseOneCard.setForeground(Color.WHITE);
		lblChooseOneCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseOneCard.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblChooseOneCard.setBounds(230, 10, 447, 65);
		contentPane_1.add(lblChooseOneCard);
		
		
		this.gameStage = gameStage;
		this.game = game;
		temp = playerIds;
		pids = temp.toArray(new String[temp.size()]);
		populateArrayListChoice();
		setPidNameChoice();
		setButtonIconsChoice();
	}
	
	/*public ArrayList<String> playerWon(ArrayList<String> playerIds) {
		if(game.hasEmptyHand(game.getNextPlayer())) {
			JLabel message = new JLabel(game.getNextPlayer() + " won, congrulation !");
			message.setFont(new Font("Arial", Font.BOLD, 30));
			JOptionPane.showMessageDialog(null, message);
			
			game.playerHand.remove(game.getPlayerHand(game.getNextPlayer()));
			playerIds.remove(game.getNextPlayers());
			if(playerIds.size() == 1) {
				JLabel mess = new JLabel("END .Thanks for playing !");
				mess.setFont(new Font("Arial", Font.BOLD, 30));
				JOptionPane.showMessageDialog(null, mess);
				System.exit(0);
			}else {
				return playerIds;
			}
		}
		return playerIds;
	}*/

	public void setButtonIconsChoice() {
		//String listString = game.getPlayerHand(game.getNextPlayer()).stream().map(Object::toString).collect(Collectors.joining(","));
		//String[] cardNames = listString.split(",");
		String[] cardNames = game.convertList(game.getPlayerHand(game.getNextPlayer()));
		cardIds = new ArrayList<>(Arrays.asList(cardNames));
		for(int i = 0; i < cardIds.size(); i++) {
			//cardButtons.get(i).setText(game.getPlayerHand(game.getNextPlayer()).toString());
			try {
				cardButtons.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pouilleux/cards/back.png")));
			}catch (NullPointerException e) {
				cardButtons.get(i).setIcon(null);
			}
		}
		for(int i = cardIds.size(); i < cardButtons.size(); i++) {
			cardButtons.get(i).setIcon(null);
		}
		
	}
	
	public void populateArrayListChoice() {
		cardButtons.add(JButton1);
		cardButtons.add(JButton2);
		cardButtons.add(JButton3);
		cardButtons.add(JButton4);
		cardButtons.add(JButton5);
		cardButtons.add(JButton6);
		cardButtons.add(JButton7);
		cardButtons.add(JButton8);
		cardButtons.add(JButton9);
		cardButtons.add(JButton10);
		cardButtons.add(JButton11);
		cardButtons.add(JButton12);
		cardButtons.add(JButton13);
		cardButtons.add(JButton14);
		cardButtons.add(JButton15);
		cardButtons.add(JButton16);
		cardButtons.add(JButton17);
		cardButtons.add(JButton18);
		cardButtons.add(JButton19);
		cardButtons.add(JButton20);
		cardButtons.add(JButton21);
		cardButtons.add(JButton22);
		cardButtons.add(JButton23);
		cardButtons.add(JButton24);
		cardButtons.add(JButton25);
		cardButtons.add(JButton26);
		cardButtons.add(JButton27);
		cardButtons.add(JButton28);
	}
	
	public void setPidNameChoice() {
		String currentPlayer = game.getNextPlayer();
		lblChooseOneCard.setText(currentPlayer + "'s cards");
	}	
	
	public void setPidNameChoice(String currentPlayer) {
		lblChooseOneCard.setText(currentPlayer + "'s cards");
	}
	
}
