package medicalstore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class newsupplierdetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newsupplierdetails frame = new newsupplierdetails();
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
	public newsupplierdetails() {
		setTitle("Medical Store Bill Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     New Supplier Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(222, 35, 249, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("     Supplier Name*");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(52, 107, 133, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("   Supplier Address*");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(52, 189, 133, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("   Supplier Phone No*");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(52, 282, 151, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("   Supplier Email Id*");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(52, 375, 151, 28);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(292, 107, 266, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		FocusListener focus_event = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter","*Error",JOptionPane.ERROR_MESSAGE);
                    textField.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField.addFocusListener(focus_event);

		
		textField_1 = new JTextField();
		textField_1.setBounds(292, 203, 266, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		FocusListener focus_event1 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Incorrect","*Error",JOptionPane.ERROR_MESSAGE);
                    textField.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField.addFocusListener(focus_event1);

		
		
		textField_2 = new JTextField();
		textField_2.setBounds(292, 282, 266, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		FocusListener focus_event2 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter","*Error",JOptionPane.ERROR_MESSAGE);
                    textField.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField.addFocusListener(focus_event2);

		
		
		textField_3 = new JTextField();
		textField_3.setBounds(292, 375, 266, 31);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		FocusListener focus_event3 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter","*Error",JOptionPane.ERROR_MESSAGE);
                    textField.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField.addFocusListener(focus_event3);

		
		JButton btnNewButton = new JButton("     Save");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(145, 490, 100, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("     Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(308, 490, 100, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("    All");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(484, 490, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("  Previous");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcomescreen ws=new welcomescreen();
				ws.setVisible(true);
		
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(610, 490, 116, 23);
		contentPane.add(button);
	}

}
