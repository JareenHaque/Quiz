import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;

public class main extends JFrame {
	public int result = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setBackground(new Color(255, 99, 71));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 543);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 99, 71));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWelcomeToQuizztime = new JLabel("Welcome to QuiZztime!!");
		lblWelcomeToQuizztime.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblWelcomeToQuizztime.setForeground(Color.BLUE);
		lblWelcomeToQuizztime.setBounds(590, 300, 500, 50);
		contentPane.add(lblWelcomeToQuizztime);

		JLabel lblSoHowWell = new JLabel(
				"So, how well do you know your teachers?? What about facing a new challenge?  ");
		lblSoHowWell.setForeground(new Color(255, 255, 255));
		lblSoHowWell.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSoHowWell.setBounds(400, 400, 1000, 46);
		contentPane.add(lblSoHowWell);

		JLabel lblWantToPlay = new JLabel("Want to play??");
		lblWantToPlay.setForeground(new Color(240, 255, 255));
		lblWantToPlay.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblWantToPlay.setBounds(740, 450, 226, 25);
		contentPane.add(lblWantToPlay);

		JButton button = new JButton("Play");
		button.setBackground(Color.GREEN);
		button.setFont(new Font("Dialog", Font.BOLD, 24));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewJFrame play = new NewJFrame();
				play.setVisible(true);
				this.dispose();

			}

			private void dispose() {
				// TODO Auto-generated method stub

			}
		});

		button.setBounds(300, 700, 250, 80);
		contentPane.add(button);

		Button button_1 = new Button("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}

		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 24));
		button_1.setBackground(Color.RED);
		button_1.setBounds(1100, 700, 250, 80);
		contentPane.add(button_1);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Javatask\\Qtime.jpg"));
		label_1.setBounds(160, -120, 15000, 400);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Javatask\\letsplaynew.PNG"));
		label_2.setBounds(770, 500, 500, 100);
		contentPane.add(label_2);

		JButton btnAbout = new JButton("About");

		btnAbout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAbout.setBounds(122, 900, 89, 23);
		contentPane.add(btnAbout);

		JButton btnHelp = new JButton("Help");
		btnHelp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHelp.setBounds(230, 900, 89, 23);
		contentPane.add(btnHelp);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Javatask\\IMG_324732.jpg"));
		label.setBounds(0, 0, 10000, 1000);
		contentPane.add(label);
		
		btnHelp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,
						" This is a game about selecting the person shown in the picture correctly!" + '\n'
								+ "You just have to Click on 'Play' and the game will be started." + '\n'
								+ "And finally you can see how much score you have got! " + '\n' + "It's fun! right?");

			}
		});
		btnAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Developer: Jareen Samaraa" + '\n' + "38th Batch, Department of CSE"
						+ '\n' + "Metropolitan university");

			}
		});

	}
}
