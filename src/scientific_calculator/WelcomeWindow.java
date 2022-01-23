package scientific_calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class WelcomeWindow {

	private JFrame frame;
	private JTextField txtWelcomeToScientific;
	private JTextField txtPleaseEnterscientific;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow window = new WelcomeWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WelcomeWindow() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(100, 100, 400, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(10, 11, 364, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSC = new JButton("Scientific Calculator");
		btnSC.setEnabled(false);
		btnSC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ScientificCalculator sc = new ScientificCalculator();
				sc.setVisible(true);
			}
		});
		btnSC.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSC.setForeground(new Color(255, 255, 255));
		btnSC.setBackground(new Color(0, 0, 128));
		btnSC.setBounds(99, 198, 173, 35);
		frame.getContentPane().add(btnSC);
		
		JButton btnWN = new JButton("Welcome Note");
		btnWN.setEnabled(false);
		btnWN.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnWN.setForeground(new Color(255, 255, 255));
		btnWN.setBackground(new Color(0, 0, 128));
		btnWN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Welcome to Java GUI Programming", "WELCOME", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnWN.setBounds(99, 141, 173, 35);
		frame.getContentPane().add(btnWN);
		
		txtWelcomeToScientific = new JTextField();
		txtWelcomeToScientific.setForeground(new Color(255, 255, 255));
		txtWelcomeToScientific.setBackground(new Color(0, 0, 0));
		txtWelcomeToScientific.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToScientific.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtWelcomeToScientific.setText("WELCOME TO SCIENTIFIC CALCULATOR");
		txtWelcomeToScientific.setBounds(10, 23, 364, 45);
		frame.getContentPane().add(txtWelcomeToScientific);
		txtWelcomeToScientific.setColumns(10);
		
		txtPleaseEnterscientific = new JTextField();
		txtPleaseEnterscientific.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseEnterscientific.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPleaseEnterscientific.setBackground(new Color(255, 255, 0));
		txtPleaseEnterscientific.setText("Please Enter \"Scientific Calculator\" to Calculate.");
		txtPleaseEnterscientific.setBounds(10, 254, 364, 35);
		frame.getContentPane().add(txtPleaseEnterscientific);
		txtPleaseEnterscientific.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnWN.setEnabled(true);
				btnSC.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(0, 128, 0));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(99, 87, 59, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnWN.setEnabled(false);
				btnSC.setEnabled(false);
			}
		});
		rdbtnOff.setSelected(true);
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setForeground(Color.WHITE);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnOff.setBackground(new Color(255, 0, 0));
		rdbtnOff.setBounds(213, 87, 59, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}
