package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainEntryPage {

	private JFrame frmSkncoeMainEntry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEntryPage window = new MainEntryPage();
					window.frmSkncoeMainEntry.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainEntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSkncoeMainEntry = new JFrame();
		frmSkncoeMainEntry.getContentPane().setBackground(new Color(255, 255, 255));
		frmSkncoeMainEntry.getContentPane().setForeground(new Color(255, 255, 255));
		frmSkncoeMainEntry.setTitle("SKNCOE Main Entry Page");
		frmSkncoeMainEntry.setIconImage(Toolkit.getDefaultToolkit().getImage(MainEntryPage.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = (int)dim.getWidth();
		int height = (int)dim.getHeight();
		frmSkncoeMainEntry.setSize((int)width,(int)height);
		frmSkncoeMainEntry.setLocationRelativeTo(null);
		
//		frmSkncoeMainEntry.setBounds(100, 100, 450, 300);
		frmSkncoeMainEntry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSkncoeMainEntry.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To SKNCOE  Login Page");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(0, 23, 1522, 80);
		frmSkncoeMainEntry.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(119, 136, 1283, 36);
		frmSkncoeMainEntry.getContentPane().add(separator);
		
		JButton btnStaff = new JButton("");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffDatabaseManagement.main(null);
			}
		});
		btnStaff.setIcon(new ImageIcon(MainEntryPage.class.getResource("/Images/Teacher.jpg")));
		btnStaff.setBounds(191, 236, 545, 354);
		frmSkncoeMainEntry.getContentPane().add(btnStaff);
		
		JButton btnStudent = new JButton("");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDatabaseManagement.main(null);
			}
		});
		btnStudent.setIcon(new ImageIcon(MainEntryPage.class.getResource("/Images/Student.jpg")));
		btnStudent.setBounds(897, 236, 461, 354);
		frmSkncoeMainEntry.getContentPane().add(btnStudent);
		
		JLabel lblNewLabel_1 = new JLabel("STAFF");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1.setBounds(316, 178, 214, 60);
		frmSkncoeMainEntry.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("STUDENT");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1_1.setBounds(1035, 178, 214, 60);
		frmSkncoeMainEntry.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(119, 639, 1283, 36);
		frmSkncoeMainEntry.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				LoginForm.main(null);
				frmSkncoeMainEntry.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(64, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBack.setBounds(340, 685, 237, 60);
		frmSkncoeMainEntry.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(64, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(958, 685, 237, 60);
		frmSkncoeMainEntry.getContentPane().add(btnExit);
	}
}
