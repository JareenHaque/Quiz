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

public class NewJFrame8 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame8 frame = new NewJFrame8();
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
	public NewJFrame8() {
		setBackground(new Color(47, 79, 79));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 551);
		contentPane = new JPanel();
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
		label_1.setIcon(new ImageIcon("C:\\Javatask\\fahimsir.PNG"));
		label_1.setBounds(304, 287, 248, 255);
		contentPane.add(label_1);
		
		JRadioButton rdbtnSaymonSir = new JRadioButton("Saymon Sir");
		rdbtnSaymonSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnSaymonSir.setBackground(Color.ORANGE);
		rdbtnSaymonSir.setBounds(900,220, 150,56);
		contentPane.add(rdbtnSaymonSir);
		
		JRadioButton rdbtnShorifSir = new JRadioButton("Oli Sir");
		rdbtnShorifSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnShorifSir.setBackground(Color.ORANGE);
		rdbtnShorifSir.setBounds(900, 320, 150, 56);
		contentPane.add(rdbtnShorifSir);
		
		JRadioButton rdbtnAshiqSir = new JRadioButton("Ashiq Sir");
		rdbtnAshiqSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAshiqSir.setBackground(Color.ORANGE);
		rdbtnAshiqSir.setBounds(900, 420, 150,56);
		contentPane.add(rdbtnAshiqSir);
		
		JRadioButton rdbtnFahimSir = new JRadioButton("Fahim Sir");
		rdbtnFahimSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFahimSir.setBackground(Color.ORANGE);
		rdbtnFahimSir.setBounds(900, 520, 150, 56);
		contentPane.add(rdbtnFahimSir);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rdbtnFahimSir);		
		bg.add(rdbtnSaymonSir);
		bg.add(rdbtnShorifSir);
		bg.add(rdbtnAshiqSir);

		
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewJFrame9 fs=new NewJFrame9();
				fs.setVisible(true);
				this.dispose();
				
				if(rdbtnFahimSir.isSelected()) {
					//result = result+10;
					
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
		button.setBounds(1100,700, 126, 56);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_2.setBounds(0, 0, 1713, 996);
		contentPane.add(label_2);
	}

}
