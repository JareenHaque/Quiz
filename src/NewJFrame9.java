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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewJFrame9 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame9 frame = new NewJFrame9();
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
	public NewJFrame9() {
		setBackground(new Color(47, 79, 79));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 554);
		contentPane = new JPanel(); 
		contentPane.setForeground(new Color(230, 230, 250));
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Can you guess who is he? ");
		label.setForeground(new Color(255, 69, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 28));
		label.setBackground(new Color(47, 79, 79));
		label.setBounds(241, 137, 577, 68);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Javatask\\oli sir.jpg"));
		label_1.setBounds(299, 137, 500, 500);
		contentPane.add(label_1);
		
		JRadioButton rdbtnAjmainSir = new JRadioButton("Azmain Sir");
		rdbtnAjmainSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAjmainSir.setBackground(Color.ORANGE);
		rdbtnAjmainSir.setBounds(900, 220,150, 56);
		contentPane.add(rdbtnAjmainSir);
		
		JRadioButton rdbtsaymon = new JRadioButton("Saymon Sir");
		rdbtsaymon.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtsaymon.setBackground(Color.ORANGE);
		rdbtsaymon.setBounds(900, 320, 150, 56);
		contentPane.add(rdbtsaymon);
		
		JRadioButton rdbtnOliSir = new JRadioButton("Oli Sir");
		rdbtnOliSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnOliSir.setBackground(Color.ORANGE);
		rdbtnOliSir.setBounds(900, 420,150, 56);
		contentPane.add(rdbtnOliSir);
		
		JRadioButton rdbtnAmitSir = new JRadioButton("Amit Sir");
		rdbtnAmitSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAmitSir.setBackground(Color.ORANGE);
		rdbtnAmitSir.setBounds(900, 520, 150, 56);
		contentPane.add(rdbtnAmitSir);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rdbtnAmitSir);		
		bg.add(rdbtnAjmainSir);
		bg.add(rdbtnOliSir);
		bg.add(rdbtsaymon);
		
		
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				NewJFrame10 ol=new NewJFrame10();
				ol.setVisible(true);
				this.dispose();
				
				if(rdbtnOliSir.isSelected()) {
					//result = result+10;
					//if(result)
				//lblProcessing.setText("You scored "+ result+ "% !");
					
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
		button.setFont(new Font("Tahoma", Font.BOLD, 21));
		button.setForeground(Color.BLUE);
		
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(1100, 700, 126, 54);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_2.setBounds(0, 0, 1713, 996);
		contentPane.add(label_2);
	
		
		final JLabel lblProcessing = new JLabel("Click 'Next' to see your result!");
		lblProcessing.setForeground(new Color(230, 230, 250));
		lblProcessing.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblProcessing.setBackground(Color.PINK);
		lblProcessing.setBounds(1300, 900,10000, 35);
		contentPane.add(lblProcessing);
	}

}
