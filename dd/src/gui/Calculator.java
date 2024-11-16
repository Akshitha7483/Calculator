package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstno;
	double seno;
	double result;
	String operator;
	String final_ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 737);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(92, 57, 352, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(109, 109, 109));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton.setBounds(94, 131, 80, 80);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBackground(new Color(109, 109, 109));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() + btnNewButton_1.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_1.setBounds(184, 131, 80, 80);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(62, 62, 62));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "+";
				firstno=Double.parseDouble(textField.getText());
				textField.setText(" ");
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_2.setBounds(364, 406, 80, 80);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(109, 109, 109));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_3.setBounds(94, 406, 80, 80);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("=");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(62, 62, 62));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seno=Double.parseDouble(textField.getText());
				
				if(operator == "+")
				{
				  result=firstno + seno;
				  final_ans=String.format("%.3f", result);
				  textField.setText(final_ans);
				}
				else if(operator == "-")
				     {
					  result=firstno - seno;
					  final_ans=String.format("%.3f", result);
					  textField.setText(final_ans);
					 }
				    else if(operator == "*")
				         {
				            result=firstno * seno;
				            final_ans=String.format("%.3f", result);
				            textField.setText(final_ans);
				         }
				         else
					      {
				            result=firstno / seno;
				           final_ans=String.format("%.3f", result);
				            textField.setText(final_ans);
				          }
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_4.setBounds(184, 508, 171, 59);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBackground(new Color(109, 109, 109));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_5.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_5.setBounds(274, 131, 80, 80);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(109, 109, 109));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_6.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_6.setBounds(184, 222, 80, 80);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setBackground(new Color(109, 109, 109));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_7.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_7.setBounds(274, 222, 80, 80);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setBackground(new Color(109, 109, 109));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_8.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_8.setBounds(94, 315, 80, 80);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setBackground(new Color(109, 109, 109));
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_9.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_9.setBounds(184, 313, 80, 80);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.setBackground(new Color(109, 109, 109));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_10.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_10.setBounds(274, 313, 80, 80);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("/");
		btnNewButton_11.setForeground(new Color(255, 255, 255));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "/";
				firstno=Double.parseDouble(textField.getText());
				textField.setText(" ");
			}
		});
		btnNewButton_11.setBackground(new Color(62, 62, 62));
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_11.setBounds(364, 131, 80, 80);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("X");
		btnNewButton_12.setForeground(new Color(255, 255, 255));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "*";
				firstno=Double.parseDouble(textField.getText());
				textField.setText(" ");
			}
		});
		btnNewButton_12.setBackground(new Color(62, 62, 62));
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_12.setBounds(364, 222, 80, 80);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setForeground(new Color(255, 255, 255));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "-";
				firstno=Double.parseDouble(textField.getText());
				textField.setText(" ");
			}
			
		});
		btnNewButton_13.setBackground(new Color(62, 62, 62));
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_13.setBounds(363, 315, 80, 80);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton(".");
		btnNewButton_14.setForeground(new Color(255, 255, 255));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_14.getText();
				textField.setText(enterno);
			}
			
		});
		btnNewButton_14.setBackground(new Color(109, 109, 109));
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_14.setBounds(274, 406, 80, 80);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.setForeground(new Color(255, 255, 255));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_15.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_15.setBackground(new Color(109, 109, 109));
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_15.setBounds(184, 406, 80, 80);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("4");
		btnNewButton_16.setForeground(new Color(255, 255, 255));
		btnNewButton_16.setBackground(new Color(109, 109, 109));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterno=textField.getText() +btnNewButton_16.getText();
				textField.setText(enterno);
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_16.setBounds(94, 222, 80, 82);
		frame.getContentPane().add(btnNewButton_16);
	}
}
