package medicalstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class updatemedicine extends JFrame {

	private JPanel contentPane;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_8;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatemedicine frame = new updatemedicine();
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
	public updatemedicine() {
		setTitle("Medical Store Bill Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Medicine Batch No*");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 53, 164, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("     Medicine Name*");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 113, 148, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("     Medicine Company*");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 186, 164, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Medicine Quantity*");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(20, 255, 138, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("     Medicine Expiry Date*");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 325, 190, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("     Medicine Type*");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(648, 64, 181, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("     Medicine Purchase Price*");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(615, 116, 237, 17);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("     Medicine Sale Price*");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(626, 186, 203, 20);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("     Medicine Rack No*");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(615, 255, 223, 23);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("     Medicine Purchase Date*");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(0, 374, 200, 20);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("     Supplier Name*");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(626, 325, 203, 20);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("    Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(309, 459, 122, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("  Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(571, 459, 113, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("  All");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(784, 459, 100, 31);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(221, 53, 283, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 113, 283, 42);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 186, 283, 42);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(221, 252, 283, 42);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(221, 312, 283, 42);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(862, 102, 302, 42);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(862, 186, 302, 42);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(862, 252, 302, 42);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(221, 369, 279, 42);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("                   Update  Medicine");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_11.setBounds(194, 11, 449, 29);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("    Supplier Id*");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_12.setBounds(626, 378, 138, 23);
		contentPane.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(862, 378, 302, 39);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(1050, 44, 302, 41);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(1050, 327, 302, 40);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("   Open");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(116, 459, 113, 31);
		contentPane.add(btnNewButton_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(862, 44, 148, 29);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(862, 325, 178, 31);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_4 = new JButton("  Previous");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcomescreen ws=new welcomescreen();
				ws.setVisible(true);
		
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(919, 464, 113, 23);
		contentPane.add(btnNewButton_4);
	}
}
