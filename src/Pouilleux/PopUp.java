package Pouilleux;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;


public class PopUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	String cardImage1 = "", cardImage2 = "";
	Game game;
	ArrayList<Pcards> playerHand;
	int choice1, choice2;
	ArrayList<JButton> cardButtons;
	GameStage gameStage;
	JButton topCardButton1;
	JButton topCardButton2;
	PopUp pu = this;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUp frame = new PopUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public PopUp() {};//String cardName1, String cardName2, int index1, int index2, Game game, ArrayList<JButton> cardButtons, GameStage gameStage, JButton topCardButton1, JButton topCardButton2
	public PopUp(String cardName1, String cardName2, int index1, int index2, Game game, ArrayList<JButton> cardButtons, GameStage gameStage, JButton topCardButton1, JButton topCardButton2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 468);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton useCardButton = new JButton("Use this pair");
		useCardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				try {
					
					game.submitPlayerCard(game.getCurrentPlayer(), playerHand.get(index1), playerHand.get(index2), gameStage);
				}
				catch (InvalidPlaySubmissionException ex) {
					Logger.getLogger(PopUp.class.getName()).log(Level.SEVERE, null, ex);
					i++;
				}
				pu.revalidate();
				gameStage.setPidName(game.getCurrentPlayer());
				gameStage.setButtonIcons();
				if(i==0) {
					topCardButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pouilleux/cards/" + cardImage1 + ".png")));
					topCardButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pouilleux/cards/" + cardImage2 + ".png")));
				}
				pu.dispose();
			}
		});
		useCardButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		useCardButton.setBounds(62, 329, 164, 67);
		contentPane.add(useCardButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pu.dispose();
			}
		});
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		cancelButton.setBounds(278, 329, 164, 67);
		contentPane.add(cancelButton);
		
		JLabel popLabel1 = new JLabel("");
		popLabel1.setBounds(136, 138, 90, 126);
		contentPane.add(popLabel1);
		
		JLabel popLabel2 = new JLabel("");
		popLabel2.setBounds(278, 138, 90, 126);
		contentPane.add(popLabel2);
		
		cardImage1 = cardName1;
		cardImage2 = cardName2;
		this.game = game;
		playerHand = game.getPlayerHand(game.getCurrentPlayer());
		choice1 = index1;
		choice2 = index2;
		this.cardButtons = cardButtons;
		popLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pouilleux/cards/" + cardImage1 + ".png")));
		popLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pouilleux/cards/" + cardImage2 + ".png")));
		this.gameStage = gameStage;
		this.topCardButton1 = topCardButton1;
		this.topCardButton2 = topCardButton2;
	}

}






