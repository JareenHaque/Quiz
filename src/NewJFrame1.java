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

public class NewJFrame1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame1 frame = new NewJFrame1();
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
	public NewJFrame1() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 533);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Can you guess who is he? ");
		label.setForeground(new Color(255, 69, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 28));
		label.setBackground(new Color(255, 175, 175));
		label.setBounds(241, 137, 577, 68);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Javatask\\amitsir.jpg"));
		label_1.setBounds(275, 240, 313, 353);
		contentPane.add(label_1);
		
		JRadioButton rdbtnFahimSir = new JRadioButton("Fahim Sir");
		rdbtnFahimSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFahimSir.setBackground(Color.ORANGE);
		rdbtnFahimSir.setBounds(900, 220, 150, 56);
		contentPane.add(rdbtnFahimSir);
		
		JRadioButton rdbtnPrinceSir = new JRadioButton("Prince Sir");
		rdbtnPrinceSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnPrinceSir.setBackground(Color.ORANGE);
		rdbtnPrinceSir.setBounds(900, 320, 150, 56);
		contentPane.add(rdbtnPrinceSir);
		
		JRadioButton rdbtnAjmainSir = new JRadioButton("Azmain Sir");
		rdbtnAjmainSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAjmainSir.setBackground(Color.ORANGE);
		rdbtnAjmainSir.setBounds(900, 420, 150, 56);
		contentPane.add(rdbtnAjmainSir);
		
		JRadioButton rdbtnAmitSir = new JRadioButton("Amit Sir");
		rdbtnAmitSir.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAmitSir.setBackground(Color.ORANGE);
		rdbtnAmitSir.setBounds(900, 520, 150, 56);
		contentPane.add(rdbtnAmitSir);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnFahimSir);
		bg.add(rdbtnPrinceSir);
		bg.add(rdbtnAjmainSir);
		bg.add(rdbtnAmitSir);
		
		JButton button = new JButton("Next");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewJFrame2 am= new NewJFrame2();
				am.setVisible(true);
				this.dispose();
				
				if(rdbtnAmitSir.isSelected()) {
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
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Tahoma", Font.BOLD, 21));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(1100, 700, 126,54);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Javatask\\Dark.jpg"));
		label_2.setBounds(0, 0, 1710, 996);
		contentPane.add(label_2);
	}

}
