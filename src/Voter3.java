import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Voter3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voter3 frame = new Voter3();
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
	public Voter3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSterlingArcher = new JLabel("Sterling Archer:");
		lblSterlingArcher.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSterlingArcher.setBounds(10, 11, 84, 22);
		contentPane.add(lblSterlingArcher);
		
		JLabel lblRickSanchez = new JLabel("Rick Sanchez: ");
		lblRickSanchez.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRickSanchez.setBounds(120, 10, 78, 24);
		contentPane.add(lblRickSanchez);
		
		JLabel lblBojackHorseman = new JLabel("Bojack Horseman: ");
		lblBojackHorseman.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBojackHorseman.setBounds(219, 10, 105, 24);
		contentPane.add(lblBojackHorseman);
		
		JLabel lblCounter1 = new JLabel("");
		lblCounter1.setBackground(Color.WHITE);
		lblCounter1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCounter1.setBounds(20, 35, 40, 40);
		contentPane.add(lblCounter1);
		
		JLabel lblCounter2 = new JLabel("");
		lblCounter2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCounter2.setBounds(130, 40, 40, 40);
		contentPane.add(lblCounter2);
		
		JLabel lblCounter3 = new JLabel("");
		lblCounter3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCounter3.setBounds(229, 40, 40, 40);
		contentPane.add(lblCounter3);
		
		
		Counters c = new Counters();
		lblCounter1.setText(Integer.toString(c.counter1));
		lblCounter2.setText(Integer.toString(c.counter2));
		lblCounter3.setText(Integer.toString(c.counter3));
	}
}
