package Pouilleux;

import java.awt.EventQueue;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.NullPointerException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GameStage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	ChoiceCard choiceCard;
	ArrayList<String> temp = new ArrayList<>();
	String[] pids;
	Game game;
	ArrayList<JButton> cardButtons = new ArrayList<>();
	ArrayList<String> cardIds;
	PopUp window;
	Menu menu;
	int numberCardSelect = 0;
	int index1, index2;
	String cardId1, cardId2;
	GameStage gs = this;
	JButton topCard1;
	JButton topCard2;
	
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
	private JLabel lblNewLabel_1;
	private JButton notPairsButton;
	JButton btnChooseCards;
	private JButton btnNewButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameStage frame = new GameStage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GameStage() {};//ArrayList<String> playerIds
	
	public GameStage(ArrayList<String> playerIds) {
		
		
		setTitle("Pouilleux");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 100, 0));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		topCard1 = new JButton("");
		topCard1.setBounds(1133, 96, 90, 126);
		contentPane.add(topCard1);
		
		topCard2 = new JButton("");
		topCard2.setBounds(1254, 96, 90, 126);
		contentPane.add(topCard2);
		
		JButton1 = new JButton("");
		JButton1.setBounds(178, 215, 90, 126);
		JButton1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(0) != null) {
						numberCardSelect++;
						index1 = 0;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(0) != null) {
						index2 = 0;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton1);
		
		JButton2 = new JButton("");
		JButton2.setBounds(278, 215, 90, 126);
		JButton2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		JButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(1) != null) {
						numberCardSelect++;
						index1 = 1;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(1) != null) {
						index2 = 1;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton2);
		
		JButton3 = new JButton("");
		JButton3.setBounds(378, 215, 90, 126);
		JButton3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		JButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(2) != null) {
						numberCardSelect++;
						index1 = 2;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(2) != null) {
						index2 = 2;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton3);
		
		JButton4 = new JButton("");
		JButton4.setBounds(478, 215, 90, 126);
		JButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(3) != null) {
						numberCardSelect++;
						index1 = 3;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(3) != null) {
						index2 = 3;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton4);
		
		JButton5 = new JButton("");
		JButton5.setBounds(578, 215, 90, 126);
		JButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(4) != null) {
						numberCardSelect++;
						index1 = 4;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(4) != null) {
						index2 = 4;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton5);
		
		JButton6 = new JButton("");
		JButton6.setBounds(678, 215, 90, 126);
		JButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(5) != null) {
						numberCardSelect++;
						index1 = 5;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(5) != null) {
						index2 = 5;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton6);
		
		JButton7 = new JButton("");
		JButton7.setBounds(778, 215, 90, 126);
		JButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(6) != null) {
						numberCardSelect++;
						index1 = 6;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(6) != null) {
						index2 = 6;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton7);
		
		JButton8 = new JButton("");
		JButton8.setBounds(180, 351, 90, 126);
		JButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(7) != null) {
						numberCardSelect++;
						index1 = 7;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(7) != null) {
						index2 = 7;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton8);
		
		JButton9 = new JButton("");
		JButton9.setBounds(278, 351, 90, 126);
		JButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(8) != null) {
						numberCardSelect++;
						index1 = 8;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(8) != null) {
						index2 = 8;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton9);
		
		JButton10 = new JButton("");
		JButton10.setBounds(378, 351, 90, 126);
		JButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(9) != null) {
						numberCardSelect++;
						index1 = 9;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(9) != null) {
						index2 = 9;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton10);
		
		JButton11 = new JButton("");
		JButton11.setBounds(478, 351, 90, 126);
		JButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(10) != null) {
						numberCardSelect++;
						index1 = 10;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(10) != null) {
						index2 = 10;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton11);
		
		JButton12 = new JButton("");
		JButton12.setBounds(578, 351, 90, 126);
		JButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(11) != null) {
						numberCardSelect++;
						index1 = 11;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(11) != null) {
						index2 = 11;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton12);
		
		JButton13 = new JButton("");
		JButton13.setBounds(678, 351, 90, 126);
		JButton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(12) != null) {
						numberCardSelect++;
						index1 = 12;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(12) != null) {
						index2 = 12;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton13);
		
		JButton14 = new JButton("");
		JButton14.setBounds(778, 351, 90, 126);
		JButton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(13) != null) {
						numberCardSelect++;
						index1 = 13;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(13) != null) {
						index2 = 13;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton14);
		
		JButton15 = new JButton("");
		JButton15.setBounds(180, 485, 90, 126);
		JButton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(14) != null) {
						numberCardSelect++;
						index1 = 14;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(14) != null) {
						index2 = 14;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton15);
		
		JButton16 = new JButton("");
		JButton16.setBounds(278, 485, 90, 126);
		JButton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(15) != null) {
						numberCardSelect++;
						index1 = 15;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(15) != null) {
						index2 = 15;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton16);
		
		JButton17 = new JButton("");
		JButton17.setBounds(378, 485, 90, 126);
		JButton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(16) != null) {
						numberCardSelect++;
						index1 = 16;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(16) != null) {
						index2 = 16;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton17);
		
		JButton18 = new JButton("");
		JButton18.setBounds(478, 485, 90, 126);
		JButton18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(17) != null) {
						numberCardSelect++;
						index1 = 17;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(17) != null) {
						index2 = 17;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton18);
		
		JButton19 = new JButton("");
		JButton19.setBounds(578, 485, 90, 126);
		JButton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					
					if(cardIds.get(18) != null) {
						numberCardSelect++;
						index1 = 18;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(18) != null) {
						index2 = 18;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton19);
		
		JButton20 = new JButton("");
		JButton20.setBounds(678, 485, 90, 126);
		JButton20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(19) != null) {
						index1 = 19;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(19) != null) {
						index2 = 19;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton20);
		
		JButton21 = new JButton("");
		JButton21.setBounds(778, 485, 90, 126);
		JButton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(20) != null) {
						index1 = 20;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(20) != null) {
						index2 = 20;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton21);
		
		JButton22 = new JButton("");
		JButton22.setBounds(180, 621, 90, 126);
		JButton22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(21) != null) {
						index1 = 21;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(21) != null) {
						index2 = 21;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);;
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton22);
		
		JButton23 = new JButton("");
		JButton23.setBounds(278, 621, 90, 126);
		JButton23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(22) != null) {
						index1 = 22;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(22) != null) {
						index2 = 22;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton23);
		
		JButton24 = new JButton("");
		JButton24.setBounds(378, 621, 90, 126);
		JButton24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(23) != null) {
						index1 = 23;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(23) != null) {
						index2 = 23;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton24);
		
		JButton25 = new JButton("");
		JButton25.setBounds(478, 621, 90, 126);
		JButton25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(24) != null) {
						index1 = 24;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(24) != null) {
						index2 = 24;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton25);
		
		JButton26 = new JButton("");
		JButton26.setBounds(578, 621, 90, 126);
		JButton26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(25) != null) {
						index1 = 25;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(25) != null) {
						index2 = 25;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton26);
		
		JButton27 = new JButton("");
		JButton27.setBounds(678, 621, 90, 126);
		JButton27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(26) != null) {
						index1 = 26;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(26) != null) {
						index2 = 26;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton27);
		
		JButton28 = new JButton("");
		JButton28.setBounds(778, 621, 90, 126);
		JButton28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int index1, index2;
				//String cardId1, cardId2;
				if(numberCardSelect==0) {
					numberCardSelect++;
					if(cardIds.get(27) != null) {
						index1 = 27;
						cardId1 = cardIds.get(index1);
					}
				}else if(numberCardSelect==1){
					if(cardIds.get(27) != null) {
						index2 = 27;
						cardId2 = cardIds.get(index2);
						window = new PopUp(cardId1, cardId2, index1, index2, game, cardButtons, gs, topCard1, topCard2);
						window.setVisible(true);
						window.setResizable(false);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						numberCardSelect=0;
					}
					
				}
			}
		});
		contentPane.add(JButton28);
		
		JLabel lblNewLabel = new JLabel("Do you have any pairs ?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(178, 23, 387, 65);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(178, 138, 329, 51);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		contentPane.add(lblNewLabel_1);
		
		notPairsButton = new JButton("Don't have pairs");
		notPairsButton.setBounds(983, 358, 192, 119);
		notPairsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnChooseCards.isVisible() == false) {
					game.nextPlayer(game.getCurrentPlayer());
					gs.setPidName(game.getCurrentPlayer());
					gs.setButtonIcons();
					btnChooseCards.setVisible(true);
				}else {
					JLabel message = new JLabel("You must choose a card !");
					message.setFont(new Font("Arial", Font.BOLD, 30));
					JOptionPane.showMessageDialog(null, message);
				}
				
			}});
		notPairsButton.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(notPairsButton);
		
		btnChooseCards = new JButton("Choose cards !");
		btnChooseCards.setBounds(1306, 358, 192, 119);
		btnChooseCards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				choiceCard = new ChoiceCard(playerIds, gs, game);
				choiceCard.setVisible(true);
				choiceCard.setResizable(false);
				choiceCard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				btnChooseCards.setVisible(false);
				

			}});
		btnChooseCards.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(btnChooseCards);
		
		btnNewButton = new JButton("QUIT");
		btnNewButton.setBounds(1383, 689, 115, 74);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gs.dispose();
				menu = new Menu();
				menu.setVisible(true);
			}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		temp = playerIds;
		pids = temp.toArray(new String[temp.size()]);
		game = new Game(pids);
		populateArrayList();
		setPidName();
		setButtonIcons();
		
	}
	
	public void setButtonIcons() {
		//String listString = game.getPlayerHand(game.getCurrentPlayer()).stream().map(Object::toString).collect(Collectors.joining(","));
		//String[] cardNames = listString.split(",");
		String[] cardNames = game.convertList(game.getPlayerHand(game.getCurrentPlayer()));
		cardIds = new ArrayList<>(Arrays.asList(cardNames));
		for(int i = 0; i < cardIds.size(); i++) {
			//cardButtons.get(i).setText(game.getPlayerHand(game.getCurrentPlayer()).toString());
			try {
				cardButtons.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pouilleux/cards/" + cardIds.get(i) + ".png")));
			}catch(NullPointerException e){
				cardButtons.get(i).setIcon(null);
			}
		}
		for(int i = cardIds.size(); i < cardButtons.size(); i++) {
			cardButtons.get(i).setIcon(null);
		}
		
	}
	
	public void populateArrayList() {
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
	
	public void setPidName() {
		String currentPlayer = game.getCurrentPlayer();
		lblNewLabel_1.setText(currentPlayer + "'s cards");
	}	
	
	public void setPidName(String currentPlayer) {
		lblNewLabel_1.setText(currentPlayer + "'s cards");
	}
	
}




