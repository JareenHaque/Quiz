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

public class NewJFrame5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame5 frame = new NewJFrame5();
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
	public NewJFrame5() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Can you guess who is she? ");
		label.setForeground(new Color(255, 69, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 28));
		label.setBackground(Color.PINK);
		label.setBounds(241, 137, 577, 68);
		contentPane.add(label);
		
		JRadioButton rdbtnFahmiMaam = new JRadioButton("Fahmi ma'am");
		rdbtnFahmiMaam.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFahmiMaam.setBackground(Color.ORANGE);
		rdbtnFahmiMaam.setBounds(900, 220, 150, 56);
		contentPane.add(rdbtnFahmiMaam);
		
		JRadioButton rdbtnLabibaMaam = new JRadioButton("Labiba ma'am");
		rdbtnLabibaMaam.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnLabibaMaam.setBackground(Color.ORANGE);
		rdbtnLabibaMaam.setBounds(900, 320, 150, 56);
		contentPane.add(rdbtnLabibaMaam);
		
		JRadioButton rdbtnAdeebaMaam = new JRadioButton("Adeeba ma'am");
		rdbtnAdeebaMaam.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAdeebaMaam.setBackground(Color.ORANGE);
		rdbtnAdeebaMaam.setBounds(900, 420, 150, 56);
		contentPane.add(rdbtnAdeebaMaam);
		
		JRadioButton rdbtnNazminMaam = new JRadioButton("Nazmin ma'am");
		rdbtnNazminMaam.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNazminMaam.setBackground(Color.ORANGE);
		rdbtnNazminMaam.setBounds(900, 520, 150, 56);
		contentPane.add(rdbtnNazminMaam);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnFahmiMaam);
		bg.add(rdbtnLabibaMaam);
		bg.add(rdbtnAdeebaMaam);
		bg.add(rdbtnNazminMaam);
		
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			NewJFrame6 fh=new NewJFrame6();
			fh.setVisible(true);
			this.dispose();
			
			if(rdbtnFahmiMaam.isSelected()) {
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
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Javatask\\fahmi maam new.PNG"));
		label_1.setBounds(287, 216, 252, 388);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_2.setBounds(0, 0, 1713,996);
		contentPane.add(label_2);
	}

}
