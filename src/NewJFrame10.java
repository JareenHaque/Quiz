import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class NewJFrame10 extends JFrame {

	private JPanel contentPane;

	/**
	 * @wbp.nonvisual location=921,79
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame10 frame = new NewJFrame10();
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
	public NewJFrame10() {

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBackground(new Color(0, 250, 154));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 250, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		scoreMatters obj = new scoreMatters();
		obj.Addit();
		contentPane.setLayout(null);

		JLabel lblYourResultIs = new JLabel("");
		lblYourResultIs.setBounds(200, 700, 10000, 170);
		lblYourResultIs.setForeground(new Color(255, 0, 0));
		lblYourResultIs.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 40));

		contentPane.add(lblYourResultIs);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(648, 350, 1090, 283);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel);
		//lblNewLabel.setText("Hey! You have scored " + scoreMatters.myresult + "!");

		JLabel lblCongrats = new JLabel(" ");
		lblCongrats.setBounds(450, 550, 1711, 170);
		lblCongrats.setForeground(new Color(255, 0, 0));
		lblCongrats.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		contentPane.add(lblCongrats);

		JLabel lblSeriously = new JLabel(" ");
		lblSeriously.setBounds(560, 680, 502, 33);
		lblSeriously.setForeground(new Color(255, 0, 0));
		lblSeriously.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(lblSeriously);
		
		JButton btnExitGame = new JButton("Exit Game");
		btnExitGame.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExitGame.setBounds(1100, 850, 150, 56);
		contentPane.add(btnExitGame);
		btnExitGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		switch (scoreMatters.myresult) {

		case 10:
		case 20:
		case 30:
		case 40:
		case 50:
			lblNewLabel.setText("Hey! You have scored " + scoreMatters.myresult + "!");
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon("C:\\Javatask\\VerySadMinions.jpg"));
			label_1.setBounds(0, 0, 10000, 400);
			contentPane.add(label_1);

			// JLabel label2 = new JLabel("");
			// label2.setIcon(new ImageIcon("C:\\Javatask\\VerySadMinions.jpg"));
			// label2.setBounds(100, 0, 300, 300);
			// contentPane.add(label2);
			

			lblSeriously.setText("Seriously?! Don't you even know your teachers?! ");
			lblYourResultIs.setText("                         Go home! You are drunk!!");
			break;
		case 60:
		case 70:
		case 80:
		case 90:
			lblNewLabel.setText("Hey! You have scored " + scoreMatters.myresult + "!");

			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Javatask\\Minion7.jpg"));
			label.setBounds(390, 0, 100000, 500);
			contentPane.add(label);
			lblCongrats.setText("      Congratulations!!!");
			lblYourResultIs.setText("                     You almost know every teachers!");
			break;

		case 100:
			lblNewLabel.setText("Hey! You have scored " + scoreMatters.myresult + "!");

			JLabel label1 = new JLabel("");
			label1.setIcon(new ImageIcon("C:\\Javatask\\Minionceleb.jpeg"));
			label1.setBounds(0, 0, 10000, 400);
			contentPane.add(label1);
			lblCongrats.setText(" wOw! Congratulations!!!");
			lblYourResultIs.setText("You are Student of the Year! You know all of your teachers!");

			break;

		}
		while(scoreMatters.myresult>105) {
			lblCongrats.setText("Oops!! Try again");
			JOptionPane.showMessageDialog(null, "Click Exit Button and Start again!" + '\n'+ "You may have done something wrong!!");
			break;
		}
		
	}
}
