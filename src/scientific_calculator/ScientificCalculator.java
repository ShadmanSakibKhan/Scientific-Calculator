package scientific_calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScientificCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator frame = new ScientificCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ScientificCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setBounds(10, 11, 202, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CASIO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(235, 42, 39, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 66, 264, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("fx-991MS");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 42, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("<-- BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeWindow ww = new WelcomeWindow();
				ww.main(null);
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(10, 120, 264, 30);
		contentPane.add(btnNewButton);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCosh.setBackground(Color.YELLOW);
		btnCosh.setBounds(116, 194, 53, 39);
		contentPane.add(btnCosh);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRoot.setBackground(Color.YELLOW);
		btnRoot.setBounds(10, 154, 53, 39);
		contentPane.add(btnRoot);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSin.setBackground(Color.YELLOW);
		btnSin.setBounds(63, 154, 53, 39);
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCos.setBackground(Color.YELLOW);
		btnCos.setBounds(116, 154, 53, 39);
		contentPane.add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTan.setBackground(Color.YELLOW);
		btnTan.setBounds(169, 154, 53, 39);
		contentPane.add(btnTan);
		
		JButton btnE = new JButton("e^x");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnE.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnE.setBackground(Color.YELLOW);
		btnE.setBounds(221, 154, 53, 39);
		contentPane.add(btnE);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLog.setBackground(Color.YELLOW);
		btnLog.setBounds(221, 194, 53, 39);
		contentPane.add(btnLog);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnTanh.setBackground(Color.YELLOW);
		btnTanh.setBounds(169, 194, 53, 39);
		contentPane.add(btnTanh);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnSinh.setBackground(Color.YELLOW);
		btnSinh.setBounds(63, 194, 53, 39);
		contentPane.add(btnSinh);
		
		JButton btnF = new JButton("1/X");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnF.setBackground(Color.YELLOW);
		btnF.setBounds(10, 194, 53, 39);
		contentPane.add(btnF);
		
		JButton btnD = new JButton("X^Y");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
			}
		});
		btnD.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnD.setBackground(Color.LIGHT_GRAY);
		btnD.setBounds(10, 244, 53, 39);
		contentPane.add(btnD);
		
		JButton btnC = new JButton("X^3");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnC.setBackground(Color.LIGHT_GRAY);
		btnC.setBounds(10, 283, 53, 39);
		contentPane.add(btnC);
		
		JButton btnB = new JButton("X^2");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnB.setBackground(Color.LIGHT_GRAY);
		btnB.setBounds(10, 322, 53, 39);
		contentPane.add(btnB);
		
		JButton btnA = new JButton("n!");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0) {
					fact = fact * a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText() + fact);
			}
		});
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnA.setBackground(Color.LIGHT_GRAY);
		btnA.setBounds(10, 361, 53, 39);
		contentPane.add(btnA);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPM.setBackground(Color.LIGHT_GRAY);
		btnPM.setBounds(10, 411, 55, 39);
		contentPane.add(btnPM);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(73, 410, 91, 39);
		contentPane.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setBounds(164, 410, 46, 39);
		contentPane.add(btnDot);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "X^Y") {
					double result2 = 1;
					for(int i = 0; i < second; i++) {
						result2 = first * result2;
					}
					answer = String.format("%.2f", result2);
					textField.setText(answer);
				}
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEq.setBackground(Color.LIGHT_GRAY);
		btnEq.setBounds(219, 408, 55, 39);
		contentPane.add(btnEq);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnDiv.setBackground(Color.LIGHT_GRAY);
		btnDiv.setBounds(221, 361, 53, 39);
		contentPane.add(btnDiv);
		
		JButton btnMul = new JButton("x");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMul.setBackground(Color.LIGHT_GRAY);
		btnMul.setBounds(221, 322, 53, 39);
		contentPane.add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSub.setBackground(Color.LIGHT_GRAY);
		btnSub.setBounds(221, 283, 53, 39);
		contentPane.add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setBounds(221, 244, 53, 39);
		contentPane.add(btnAdd);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(165, 361, 46, 39);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(165, 322, 46, 39);
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(165, 283, 46, 39);
		contentPane.add(btn9);
		
		JButton btnBS = new JButton("\uF0E7");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBS.setFont(new Font("Wingdings", Font.PLAIN, 11));
		btnBS.setBackground(Color.LIGHT_GRAY);
		btnBS.setBounds(165, 244, 46, 39);
		contentPane.add(btnBS);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(119, 361, 46, 39);
		contentPane.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(119, 322, 46, 39);
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(119, 283, 46, 39);
		contentPane.add(btn8);
		
		JButton btnClr = new JButton("C");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClr.setBackground(Color.LIGHT_GRAY);
		btnClr.setBounds(119, 244, 46, 39);
		contentPane.add(btnClr);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(73, 361, 46, 39);
		contentPane.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});		
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(73, 322, 46, 39);
		contentPane.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(73, 283, 46, 39);
		contentPane.add(btn7);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPer.setBackground(Color.LIGHT_GRAY);
		btnPer.setBounds(73, 244, 46, 39);
		contentPane.add(btnPer);
	}
}
