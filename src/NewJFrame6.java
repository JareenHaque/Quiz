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

public class NewJFrame6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame6 frame = new NewJFrame6();
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
	public NewJFrame6() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 543);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Can you guess who is he? ");
		label.setForeground(new Color(255, 69, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 28));
		label.setBackground(Color.PINK);
		label.setBounds(241, 137,577, 68);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Javatask\\Polash sir.jpg"));
		label_1.setBounds(327, 181, 432, 313);
		contentPane.add(label_1);
		
		JRadioButton rdbtnShantanuSir = new JRadioButton("Shantanu Sir");
		rdbtnShantanuSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnShantanuSir.setBackground(Color.ORANGE);
		rdbtnShantanuSir.setBounds(900, 220, 150,56);
		contentPane.add(rdbtnShantanuSir);
		
		JRadioButton rdbtnPolashSir = new JRadioButton("Polash Sir");
		rdbtnPolashSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnPolashSir.setBackground(Color.ORANGE);
		rdbtnPolashSir.setBounds(900,320, 150,56);
		contentPane.add(rdbtnPolashSir);
		
		JRadioButton rdbtnMahfujSir = new JRadioButton("Mahfuj Sir");
		rdbtnMahfujSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnMahfujSir.setBackground(Color.ORANGE);
		rdbtnMahfujSir.setBounds(900, 420, 150, 56);
		contentPane.add(rdbtnMahfujSir);
		
		JRadioButton rdbtnJogotSir = new JRadioButton("Jagoth Sir");
		rdbtnJogotSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnJogotSir.setBackground(Color.ORANGE);
		rdbtnJogotSir.setBounds(900, 520, 150,56);
		contentPane.add(rdbtnJogotSir);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnShantanuSir);
		bg.add(rdbtnPolashSir);
		bg.add(rdbtnMahfujSir);
		bg.add(rdbtnJogotSir);
		
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewJFrame7 pl=new NewJFrame7();
				
				pl.setVisible(true);
				this.dispose();
				
				if(rdbtnPolashSir.isSelected()) {
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
		button.setForeground(Color.BLUE);
		
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(1100, 700, 126, 54);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_2.setBounds(0, 0, 1713, 996);
		contentPane.add(label_2);
	}

}
