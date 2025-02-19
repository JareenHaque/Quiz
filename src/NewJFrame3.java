import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewJFrame3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame3 frame = new NewJFrame3();
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
	public NewJFrame3() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCanYouGuess = new JLabel("Can you guess who is she? ");
		lblCanYouGuess.setForeground(new Color(255, 69, 0));
		lblCanYouGuess.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblCanYouGuess.setBackground(Color.PINK);
		lblCanYouGuess.setBounds(241, 137, 577,68);
		contentPane.add(lblCanYouGuess);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Javatask\\tonumiss.PNG"));
		label_1.setBounds(229, 178, 410, 465);
		contentPane.add(label_1);
		
		JRadioButton rdbtnFahmiMaam = new JRadioButton("Fahmi ma'am");
		rdbtnFahmiMaam.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFahmiMaam.setBackground(Color.ORANGE);
		rdbtnFahmiMaam.setBounds(900, 220, 150, 56);
		contentPane.add(rdbtnFahmiMaam);
		
		JRadioButton rdbtnTonuMaam = new JRadioButton("Tonu ma'am");
		rdbtnTonuMaam.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnTonuMaam.setBackground(Color.ORANGE);
		rdbtnTonuMaam.setBounds(900, 320, 150,56);
		contentPane.add(rdbtnTonuMaam);
		
		JRadioButton rdbtnAdeebaMaam = new JRadioButton("Adeeba ma'am");
		rdbtnAdeebaMaam.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAdeebaMaam.setBackground(Color.ORANGE);
		rdbtnAdeebaMaam.setBounds(900, 420, 150, 56);
		contentPane.add(rdbtnAdeebaMaam);
		
		JRadioButton rdbtnLabibaMaam = new JRadioButton("Labiba ma'am");
		rdbtnLabibaMaam.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnLabibaMaam.setBackground(Color.ORANGE);
		rdbtnLabibaMaam.setBounds(900, 520, 150,56);
		contentPane.add(rdbtnLabibaMaam);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnFahmiMaam);
		bg.add(rdbtnTonuMaam);
		bg.add(rdbtnAdeebaMaam);
		bg.add(rdbtnLabibaMaam);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewJFrame4 tn=new NewJFrame4();
				tn.setVisible(true);
				this.dispose();
				
				if(rdbtnTonuMaam.isSelected()) {
					//result = result +10;
					
					scoreMatters obj = new scoreMatters();
					obj.Addit();
					
				}
				else {
					//result=result;
				}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setForeground(Color.BLUE);
	
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(1100,700,126, 54);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label.setBounds(0, 0, 1713, 996);
		contentPane.add(label);
	
	}
	

}
