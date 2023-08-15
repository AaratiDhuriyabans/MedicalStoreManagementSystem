package medicalstore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customerbill extends JFrame {

	private JPanel contentPane;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerbill frame = new customerbill();
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
	public customerbill() {
		setTitle("Medical Store Bill Management System");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("             91,   Saat Rasta,    Lashkar , Civil Line,    Bijapur Road,       Solapur 413004.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(23, 11, 1242, 68);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("   Customer Name *");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(23, 99, 129, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("        Age*");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(44, 149, 86, 25);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(191, 98, 298, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("    Date*");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(42, 210, 86, 25);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 148, 298, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(191, 207, 298, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("   Medicine Type*");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(23, 269, 129, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("    Medicine*");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(32, 333, 98, 25);
		contentPane.add(lblNewLabel_5);
		
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(197, 268, 195, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(198, 334, 254, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("     Quantity*");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(23, 402, 105, 25);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(197, 403, 168, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("    Total");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(42, 472, 88, 22);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(197, 472, 195, 25);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("    Reciept");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(44, 546, 108, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("   Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(203, 547, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("  Previous");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcomescreen ws=new welcomescreen();
				ws.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(363, 547, 126, 23);
		contentPane.add(btnNewButton_2);
	}
}
