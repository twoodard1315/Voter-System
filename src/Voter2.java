import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Voter2 extends JFrame {

	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voter2 frame = new Voter2();
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
	public Voter2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxCandidates = new JComboBox();
		comboBoxCandidates.setModel(new DefaultComboBoxModel(new String[] {"----------", "Sterling Archer", "Rick Sanchez", "Bojack Horseman", "Hermes Conrad", }));
		comboBoxCandidates.setToolTipText("");
		comboBoxCandidates.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxCandidates.setBounds(10, 44, 125, 22);
		contentPane.add(comboBoxCandidates);
		
		JLabel labelChoose = new JLabel("Please Choose Your Candidate: ");
		labelChoose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelChoose.setBounds(10, 11, 205, 22);
		contentPane.add(labelChoose);
		
		JButton buttonEnter = new JButton("Enter");		
		buttonEnter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonEnter.setBounds(129, 75, 75, 23);
		contentPane.add(buttonEnter);
		
		Counters count = new Counters();
		buttonEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxCandidates.getSelectedItem() == "Sterling Archer")
					count.increment1();
				else if(comboBoxCandidates.getSelectedItem() == "Rick Sanchez")
					count.increment2();
				else
					count.increment3();
				
				
				dispose();
			}
		});
	}
}
