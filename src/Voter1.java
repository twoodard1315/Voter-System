import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Voter1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	
	VoterCode vc = new VoterCode();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voter1 frame = new Voter1();
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
	public Voter1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelEnterName = new JLabel("Please Enter Your Name: ");
		labelEnterName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelEnterName.setBounds(10, 11, 214, 25);
		contentPane.add(labelEnterName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(10, 41, 214, 20);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JButton buttonExit = new JButton("Exit");
		
		buttonExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonExit.setBounds(164, 72, 60, 25);
		contentPane.add(buttonExit);
		
		JButton buttonNext = new JButton("Next");		
		buttonNext.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonNext.setBounds(10, 72, 65, 25);
		buttonNext.setVisible(false);
		contentPane.add(buttonNext);
		
		JButton buttonCheck = new JButton("Check");		
		buttonCheck.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonCheck.setBounds(85, 72, 70, 25);
		contentPane.add(buttonCheck);
		
		buttonCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean visible = vc.checkName(textFieldName.getText());
				
				if(visible == true) {
					buttonNext.setVisible(true);
				}
			}
		});		
		
		buttonNext.addActionListener(new ActionListener() {
			private String[] args;			
			
			public void actionPerformed(ActionEvent e) {
				buttonNext.setVisible(false);
				textFieldName.setText("");
				Voter2.main(args);
								
			}
		});
		
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				Voter3.main(null);
			}
		});
		
	}
}
