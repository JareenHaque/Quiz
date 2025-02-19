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

public class NewJFrame4 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame4 frame = new NewJFrame4();
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
	public NewJFrame4() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().setBackground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 533);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(46, 67, 46, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Can you guess who is he? ");
		label_1.setForeground(new Color(255, 0, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		label_1.setBackground(Color.PINK);
		label_1.setBounds(241,137,577, 68);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(new Color(47, 79, 79));
		label_2.setIcon(new ImageIcon("C:\\Javatask\\jagatsir.jpg"));
		label_2.setBounds(279, 175, 431, 385);
		getContentPane().add(label_2);
		
		JRadioButton rdbtnRajuSir = new JRadioButton("Raju Sir");
		rdbtnRajuSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnRajuSir.setBackground(Color.ORANGE);
		rdbtnRajuSir.setBounds(900, 220, 150, 56);
		getContentPane().add(rdbtnRajuSir);
		
		JRadioButton rdbtnJogotSir = new JRadioButton("Jagoth Sir");
		rdbtnJogotSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnJogotSir.setBackground(Color.ORANGE);
		rdbtnJogotSir.setBounds(900, 320, 150, 56);
		getContentPane().add(rdbtnJogotSir);
		
		JRadioButton rdbtnEahsanSir = new JRadioButton("Ehsan Sir");
		rdbtnEahsanSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnEahsanSir.setBackground(Color.ORANGE);
		rdbtnEahsanSir.setBounds(900, 420, 150, 56);
		getContentPane().add(rdbtnEahsanSir);
		
		JRadioButton rdbtnSaymonSir = new JRadioButton("Saymon Sir");
		rdbtnSaymonSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnSaymonSir.setBackground(Color.ORANGE);
		rdbtnSaymonSir.setBounds(900, 520, 150, 56);
		getContentPane().add(rdbtnSaymonSir);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnRajuSir);
		bg.add(rdbtnJogotSir);
		bg.add(rdbtnEahsanSir);
		bg.add(rdbtnSaymonSir);
		
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewJFrame5 jg=new NewJFrame5();
				jg.setVisible(true);
				this.dispose();
				
				if(rdbtnJogotSir.isSelected()) {
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
		button.setFont(new Font("Tahoma", Font.BOLD, 21));
		button.setBounds(1100, 700, 126, 54);
		button.setForeground(Color.BLUE);
		
		button.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(button);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_3.setBounds(0, 0, 1713, 996);
		getContentPane().add(label_3);
	}

}
