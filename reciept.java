package medicalstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class reciept extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reciept frame = new reciept();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int a,b,c;

	/**
	 * Create the frame.
	 */
	public reciept() {
		setTitle("Medical Store Bill Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(195, 75, 170, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("   Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(46, 464, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("     Previous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcomescreen ws=new welcomescreen();
				ws.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(181, 464, 98, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("    Reciept");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(195, 21, 106, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("    Name*");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(46, 78, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("   Address*");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(47, 120, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("  Mobile No*");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(47, 164, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("  Medicine Type*");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(47, 201, 106, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("  Quantity*");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(47, 249, 89, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 120, 170, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(195, 161, 170, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(195, 208, 170, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(195, 249, 170, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				a=Integer.parseInt(textField_4.getText());
				b=Integer.parseInt(textField_5.getText());
				//Object calculate;
				if(ae.getSource()==btnNewButton_2)
				{
					c=a*b;
					textField_6.setText(Integer.toString(c));
					setBackground(Color.WHITE);
					JOptionPane.showMessageDialog(null, " Bill Completed.....");
					dispose();
					
				}
			}
		});
		btnNewButton_2.setBounds(353, 464, 89, 23);
		contentPane.add(btnNewButton_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(195, 306, 170, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("   Rate*");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(47, 309, 71, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("   Amount*");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(46, 366, 72, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(195, 363, 170, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
}
