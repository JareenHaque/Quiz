import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class NewJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame frame = new NewJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public NewJFrame() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 534);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCanYouGuess = new JLabel("Can you guess who is he? ");
		lblCanYouGuess.setBackground(Color.PINK);
		lblCanYouGuess.setForeground(new Color(255, 69, 0));
		lblCanYouGuess.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblCanYouGuess.setBounds(241, 137, 577, 68);
		contentPane.add(lblCanYouGuess);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Javatask\\ehsansir.jpg"));
		label.setBounds(262, 185, 301, 340);
		contentPane.add(label);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Shantanu Sir");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(Color.ORANGE);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(900, 220, 150, 56);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAmitSir = new JRadioButton("Amit Sir");
		rdbtnAmitSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAmitSir.setBackground(Color.ORANGE);
		rdbtnAmitSir.setBounds(900, 320, 156, 56);
		contentPane.add(rdbtnAmitSir);
		
		JRadioButton rdbtnEahsanSir = new JRadioButton("Ehsan Sir");
		rdbtnEahsanSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnEahsanSir.setBackground(Color.ORANGE);
		rdbtnEahsanSir.setBounds(900, 420, 150, 56);
		contentPane.add(rdbtnEahsanSir);
		
		JRadioButton rdbtnAshiqSir = new JRadioButton("Ashiq Sir");
		rdbtnAshiqSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAshiqSir.setBackground(Color.ORANGE);
		rdbtnAshiqSir.setBounds(900, 520, 150, 56);
		contentPane.add(rdbtnAshiqSir);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnAmitSir);
		bg.add(rdbtnEahsanSir);
		bg.add(rdbtnAshiqSir);
		
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewJFrame1 eh= new NewJFrame1();
				eh.setVisible(true);
				this.dispose();
			
				if(rdbtnEahsanSir.isSelected()) {
					scoreMatters obj = new scoreMatters();
					obj.Addit();
					
				}
				else {
					
				}
				
			}
		

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNext.setForeground(Color.BLUE);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNext.setBackground(Color.LIGHT_GRAY);
		btnNext.setBounds(1100, 700, 126, 54);
		contentPane.add(btnNext);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_1.setBounds(0, 0, 1713, 1074);
		contentPane.add(label_1);
	}
}


	
