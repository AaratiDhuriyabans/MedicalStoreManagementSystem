package medicalstore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;

public class Medical extends JFrame {

	private static final String Panel = null;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medical frame = new Medical();
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
	public Medical() {
		setTitle("Medical Store Billing Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    Login");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 18));
		lblNewLabel.setBounds(144, 11, 83, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("   UserName:");
		lblNewLabel_1.setBounds(73, 46, 78, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("   Password :");
		lblNewLabel_2.setBounds(73, 109, 78, 24);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(203, 46, 173, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 109, 173, 24);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("     Login");
		//AbstractButton Login;
		//Login.addActionListener(this);
		//add(Panel,BorderLayout CENTER);
	//	setTitle("\n Please Login here");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(textField.getText().equals("admin")&&passwordField.getText().equals("admin"))
				{
					JOptionPane.showMessageDialog(null,"Login Succed.....");
					dispose();
					welcomescreen ws=new welcomescreen();
					ws.setVisible(true);
			
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid User.....");
					dispose();
						}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\medicalstore\\loginbutton.jpg"));
		btnNewButton.setBounds(36, 172, 167, 47);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("   Exit");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
		btnNewButton_1.setIcon(new ImageIcon("D:\\medicalstore\\exit1.jpg"));
		btnNewButton_1.setBounds(230, 172, 157, 47);
		panel.add(btnNewButton_1);
			}
}
