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

public class NewJFrame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame2 frame = new NewJFrame2();
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
	public NewJFrame2() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 556);
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
		label_1.setIcon(new ImageIcon("C:\\Javatask\\shantanu sir.PNG"));
		label_1.setBounds(369, 188, 206, 364);
		contentPane.add(label_1);
		
		JRadioButton rdbtnRajuSir = new JRadioButton("Raju Sir");
		rdbtnRajuSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnRajuSir.setBackground(Color.ORANGE);
		rdbtnRajuSir.setBounds(900, 220, 150, 56);
		contentPane.add(rdbtnRajuSir);
		
		JRadioButton rdbtnAshiqSir = new JRadioButton("Ashiq Sir");
		rdbtnAshiqSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAshiqSir.setBackground(Color.ORANGE);
		rdbtnAshiqSir.setBounds(900,320, 150, 56);
		contentPane.add(rdbtnAshiqSir);
		
		JRadioButton rdbtnSir = new JRadioButton("Peash Sir");
		rdbtnSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnSir.setBackground(Color.ORANGE);
		rdbtnSir.setBounds(900, 420, 150,56 );
		contentPane.add(rdbtnSir);
		
		JRadioButton rdbtnShantanuSir = new JRadioButton("Shantanu Sir");
		rdbtnShantanuSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnShantanuSir.setBackground(Color.ORANGE);
		rdbtnShantanuSir.setBounds(900, 520, 150, 56);
		contentPane.add(rdbtnShantanuSir);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rdbtnRajuSir);
		bg.add(rdbtnAshiqSir);
		bg.add(rdbtnSir);
		bg.add(rdbtnShantanuSir);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewJFrame3 sh= new NewJFrame3();
				sh.setVisible(true);
				this.dispose();
				
				if(rdbtnShantanuSir.isSelected()) {

					scoreMatters obj = new scoreMatters();
					obj.Addit();				}
				else {
					//result=result;
				}
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNext.setForeground(Color.BLUE);

		btnNext.setBackground(Color.LIGHT_GRAY);
		btnNext.setBounds(1100, 700, 126, 54);
		contentPane.add(btnNext);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_2.setBounds(0, 0, 1713, 1003);
		contentPane.add(label_2);
	}

}
