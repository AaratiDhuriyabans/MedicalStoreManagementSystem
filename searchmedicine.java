package medicalstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class searchmedicine extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchmedicine frame = new searchmedicine();
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
	public searchmedicine() {
		setTitle("   Search Supplier");
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
		
		JLabel lblNewLabel_9 = new JLabel("     Medicine Purchase Date*");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(0, 374, 200, 20);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("     Supplier Name*");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(626, 262, 203, 20);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("  Search");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(248, 422, 122, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("  Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(495, 422, 113, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("  All");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(729, 422, 100, 31);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(221, 53, 283, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		FocusListener focus_event = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter Batch No","*Error",JOptionPane.ERROR_MESSAGE);
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
		textField_1.setBounds(221, 113, 283, 42);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		FocusListener focus_event1 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_1.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter Batch No","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_1.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_1.addFocusListener(focus_event1);

		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 186, 283, 42);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		FocusListener focus_event2 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_2.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please Medicine name","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_2.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_2.addFocusListener(focus_event2);

		
		textField_3 = new JTextField();
		textField_3.setBounds(221, 252, 283, 42);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		FocusListener focus_event3= new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_3.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please Medicine company","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_3.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_3.addFocusListener(focus_event3);


		
		textField_4 = new JTextField();
		textField_4.setBounds(221, 312, 283, 42);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		FocusListener focus_event4 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_4.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter medicine quantity","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_4.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_4.addFocusListener(focus_event4);


		
		textField_5 = new JTextField();
		textField_5.setBounds(862, 102, 302, 42);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		FocusListener focus_event5 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_5.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter medicine expiry date","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_5.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_5.addFocusListener(focus_event5);


		
		textField_6 = new JTextField();
		textField_6.setBounds(862, 186, 302, 42);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		FocusListener focus_event6 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_6.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter medicine type","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_6.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_6.addFocusListener(focus_event6);
		FocusListener focus_event7 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_7.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter purchase date","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_7.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };


		
		textField_8 = new JTextField();
		textField_8.setBounds(221, 369, 279, 42);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		FocusListener focus_event8 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_8.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter Batch No","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_8.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_8.addFocusListener(focus_event8);


		
		JLabel lblNewLabel_11 = new JLabel("                   Search Medicine");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_11.setBounds(194, 11, 449, 29);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("    Supplier Id*");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_12.setBounds(626, 345, 138, 23);
		contentPane.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(862, 345, 302, 39);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		FocusListener focus_event9 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_9.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter medicine name","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_9.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_9.addFocusListener(focus_event9);


		
		textField_10 = new JTextField();
		textField_10.setBounds(862, 43, 302, 41);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		FocusListener focus_event10 = new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if(textField_10.getText().isEmpty())
                {
                    JOptionPane.showConfirmDialog(null, "Please enter supplier id","*Error",JOptionPane.ERROR_MESSAGE);
                    textField_10.requestFocus();
                }
            }

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub

            }
        };
        textField_10.addFocusListener(focus_event10);


		
		textField_11 = new JTextField();
		textField_11.setBounds(862, 262, 302, 40);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton button = new JButton("  Previous");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcomescreen ws=new welcomescreen();
				ws.setVisible(true);
		
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(872, 422, 116, 31);
		contentPane.add(button);
	}
}
