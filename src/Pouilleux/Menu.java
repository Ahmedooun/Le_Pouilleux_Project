package Pouilleux;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	Menu menu = this;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1093, 637);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 550, 390));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//contentPane.pack();
		
		
		JButton playButton = new JButton("PLAY");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddPlayersName().setVisible(true);
				menu.dispose();
			}
		});
		playButton.setFont(new Font("Tahoma", Font.BOLD, 27));
		playButton.setBounds(430, 268, 200, 80);
		contentPane.add(playButton);
		
		JButton exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 27));
		exitButton.setBounds(430, 410, 200, 80);
		contentPane.add(exitButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 67, 1079, 533);
		Image image = new ImageIcon(this.getClass().getResource("/Pouilleux/cards/imageJeu.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The game \"Le pouilleux\"");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("MV Boli", Font.BOLD, 36));
		lblNewLabel_1.setBounds(311, 10, 488, 91);
		contentPane.add(lblNewLabel_1);
	}
}
