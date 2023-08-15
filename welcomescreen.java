package medicalstore;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class welcomescreen extends JFrame {

	private JPanel contentPane;
	JMenu customer,medicine,report,logout;
    JMenuItem c1,m1,m2,m3,m4,m5,r1,r2;
	JMenuBar menubar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomescreen frame = new welcomescreen();
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
	public welcomescreen() {
		getContentPane().setLayout(null);
		setTitle("Welcome to Medical Store Bill Management System");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		 menubar  =new JMenuBar();
		setJMenuBar(menubar);
		
		 customer =new JMenu("Customer");
		menubar.add(customer);
		 c1= new JMenuItem("Add Customer Details");
		customer.add(c1);
		
		 medicine=new JMenu("Medicine");
		menubar.add(medicine);
		 m1=new JMenuItem("Add Medicine Details");
		medicine.add(m1);
		
		m2=new JMenuItem("Modify Medicine Details");
		medicine.add(m2);
		
		 m3=new JMenuItem("Search Medicine details");
		medicine.add(m3);
		
		m4=new JMenuItem("Delete  Medicine");
		medicine.add(m4);
		
		 m5=new JMenuItem("Stock of Medicine");
		medicine.add(m5);
		
		
		JMenu report=new JMenu("Report");
		menubar.add(report);
		 r1=new JMenuItem("Daily Purchase Report");
		report.add(r1);
		
		r2=new JMenuItem("Customer Wise Medicine Report");
		report.add(r2);
			
		 logout=new JMenu("Logout");
		menubar.add(logout);
				
		
		
	//	exit.addActionListener(new exitaction());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\medicalstore\\medicalstore.jpg"));
		lblNewLabel.setBounds(10, 0, 1324, 684);
		panel.add(lblNewLabel);
				
			}
}
