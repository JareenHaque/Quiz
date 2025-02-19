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

public class NewJFrame7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame7 frame = new NewJFrame7();
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
	public NewJFrame7() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Can you guess who is he? ");
		label.setForeground(new Color(255, 69, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 28));
		label.setBackground(Color.PINK);
		label.setBounds(241, 137, 577, 68);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Javatask\\cmw.PNG"));
		label_1.setBounds(314, 220, 264, 245);
		contentPane.add(label_1);
		
		JRadioButton rdbtnMahfujSir = new JRadioButton("Mahfuj Sir");
		rdbtnMahfujSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnMahfujSir.setBackground(Color.ORANGE);
		rdbtnMahfujSir.setBounds(900, 220, 150, 56);
		contentPane.add(rdbtnMahfujSir);
		
		JRadioButton rdbtnJakirSir = new JRadioButton("Jakir Sir");
		rdbtnJakirSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnJakirSir.setBackground(Color.ORANGE);
		rdbtnJakirSir.setBounds(900,320, 150, 56);
		contentPane.add(rdbtnJakirSir);
		
		JRadioButton rdbtnCmwSir = new JRadioButton("Head Sir");
		rdbtnCmwSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnCmwSir.setBackground(Color.ORANGE);
		rdbtnCmwSir.setBounds(900, 420, 150, 56);
		contentPane.add(rdbtnCmwSir);
		
		JRadioButton rdbtnNowshadSir = new JRadioButton("Nowshad Sir");
		rdbtnNowshadSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNowshadSir.setBackground(Color.ORANGE);
		rdbtnNowshadSir.setBounds(900,520, 150, 56);
		contentPane.add(rdbtnNowshadSir);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rdbtnMahfujSir);
		bg.add(rdbtnJakirSir);
		bg.add(rdbtnCmwSir);
		bg.add(rdbtnNowshadSir);
		
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewJFrame8 cw=new NewJFrame8();
				cw.setVisible(true);
				this.dispose();
				
				if(rdbtnCmwSir.isSelected()) {
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
		button.setBounds(1100, 700,126,54);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_2.setBounds(0, 0,1713, 996);
		contentPane.add(label_2);
	}

}
