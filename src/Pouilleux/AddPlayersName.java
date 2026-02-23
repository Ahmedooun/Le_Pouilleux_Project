package Pouilleux;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPlayersName extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pidTextBox;
	
	AddPlayersName add = this;
	
	public ArrayList<String> playerIds;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPlayersName frame = new AddPlayersName();
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
	public AddPlayersName() {
		
		playerIds = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 622);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add the names of the players (2-4)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(213, 58, 467, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name of the player :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(96, 196, 195, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel pidOneLabel = new JLabel("");
		pidOneLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pidOneLabel.setBounds(76, 270, 189, 40);
		contentPane.add(pidOneLabel);
		
		JLabel pidTwoLabel = new JLabel("");
		pidTwoLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pidTwoLabel.setBounds(598, 270, 189, 40);
		contentPane.add(pidTwoLabel);
		
		JLabel pidThreeLabel = new JLabel("");
		pidThreeLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pidThreeLabel.setBounds(76, 364, 189, 40);
		contentPane.add(pidThreeLabel);
		
		JLabel pidFourLabel = new JLabel("");
		pidFourLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pidFourLabel.setBounds(598, 364, 189, 40);
		contentPane.add(pidFourLabel);
		
		pidTextBox = new JTextField();
		pidTextBox.setBounds(301, 206, 379, 40);
		contentPane.add(pidTextBox);
		pidTextBox.setColumns(10);
		
		JButton saveButton = new JButton(" Save");
		Image image = new ImageIcon(this.getClass().getResource("/Pouilleux/cards/save.png")).getImage();
		saveButton.setIcon(new ImageIcon(image));
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pidTextBox.getText().isEmpty()) {
					JLabel message = new JLabel("Please, enter in a name !");
					message.setFont(new Font("Arial", Font.BOLD, 30));
					JOptionPane.showMessageDialog(null, message);
				}else {
					String name = pidTextBox.getText().trim();
					playerIds.add(name);
					
					if(playerIds.size()==1) {
						pidOneLabel.setText(playerIds.get(0));
					}else if(playerIds.size()==2) {
						pidOneLabel.setText(playerIds.get(0));
						pidTwoLabel.setText(playerIds.get(1));
					}else if(playerIds.size()==3) {
						pidOneLabel.setText(playerIds.get(0));
						pidTwoLabel.setText(playerIds.get(1));
						pidThreeLabel.setText(playerIds.get(2));
					}else if(playerIds.size()==4) {
						pidOneLabel.setText(playerIds.get(0));
						pidTwoLabel.setText(playerIds.get(1));
						pidThreeLabel.setText(playerIds.get(2));
						pidFourLabel.setText(playerIds.get(3));
					}
					if(playerIds.size()>0 && playerIds.size()<5) {
						JLabel message = new JLabel("Succesful save !");
						message.setFont(new Font("Arial", Font.BOLD, 30));
						JOptionPane.showMessageDialog(null, message);
						pidTextBox.setText("");
					}
					if(playerIds.size()==5) {
						JLabel message = new JLabel("2-4 players !");
						message.setFont(new Font("Arial", Font.BOLD, 30));
						JOptionPane.showMessageDialog(null, message);
						pidTextBox.setText("");
					}
				}
			}
		});
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		saveButton.setBounds(116, 439, 175, 72);
		contentPane.add(saveButton);
		
		JButton doneButton = new JButton(" Done");
		Image imag = new ImageIcon(this.getClass().getResource("/Pouilleux/cards/done.png")).getImage();
		doneButton.setIcon(new ImageIcon(imag));
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(playerIds.size()==1 || playerIds.size()==0) {
					JLabel message = new JLabel("Add more players !");
					message.setFont(new Font("Arial", Font.BOLD, 30));
					JOptionPane.showMessageDialog(null, message);
					pidTextBox.setText("");
				}else {
					//new ChoiceCard(playerIds).setVisible(true);
					new GameStage(playerIds).setVisible(true);
					add.dispose();
				}
			}
		});
		doneButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		doneButton.setBounds(598, 439, 189, 72);
		contentPane.add(doneButton);
		
		
	}
	
	public String[] getPids() {
		String[] pids = playerIds.toArray(new String[playerIds.size()]);
		return pids;
	}
	
}





