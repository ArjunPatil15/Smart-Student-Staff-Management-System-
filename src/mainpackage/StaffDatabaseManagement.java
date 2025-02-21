package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffDatabaseManagement {

	private JFrame frmStaffDatabaseManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffDatabaseManagement window = new StaffDatabaseManagement();
					window.frmStaffDatabaseManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StaffDatabaseManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStaffDatabaseManagement = new JFrame();
		frmStaffDatabaseManagement.setIconImage(Toolkit.getDefaultToolkit().getImage(StaffDatabaseManagement.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmStaffDatabaseManagement.setTitle("Staff Database Management");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = (int)dim.getWidth();
		int height = (int)dim.getHeight();
		frmStaffDatabaseManagement.setSize((int)width,(int)height);
		frmStaffDatabaseManagement.setLocationRelativeTo(null);
		
//		frmStaffDatabaseManagement.setBounds(100, 100, 450, 300);
		frmStaffDatabaseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStaffDatabaseManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Staff Database Management");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(423, 0, 676, 73);
		frmStaffDatabaseManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(142, 66, 1238, 14);
		frmStaffDatabaseManagement.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(185, 66, 1151, 627);
		frmStaffDatabaseManagement.getContentPane().add(panel);
		
		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStaff.main(null);
			}
		});
		btnAdd.setIcon(new ImageIcon(StaffDatabaseManagement.class.getResource("/Images/ADD.jpg")));
		btnAdd.setBounds(83, 20, 386, 242);
		panel.add(btnAdd);
		
		JButton btnShow = new JButton("");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowStaff.main(null);
			}
		});
		btnShow.setIcon(new ImageIcon("D:\\Java workspace\\MyProject\\src\\Images\\Display.png"));
		btnShow.setBounds(652, 20, 386, 242);
		panel.add(btnShow);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStaff.main(null);
			}
		});
		btnUpdate.setIcon(new ImageIcon("D:\\Java workspace\\MyProject\\src\\Images\\Update.png"));
		btnUpdate.setBounds(83, 330, 386, 242);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStaff.main(null);
			}
		});
		btnDelete.setIcon(new ImageIcon(StaffDatabaseManagement.class.getResource("/Images/Delete.jpg")));
		btnDelete.setBounds(652, 330, 386, 242);
		panel.add(btnDelete);
		
		JLabel lblNewLabel_1 = new JLabel("ADD Staff");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(187, 272, 161, 38);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Show Staff");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(759, 272, 189, 38);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Update Staff");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(156, 582, 220, 38);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Delete Staff");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(759, 582, 202, 38);
		panel.add(lblNewLabel_1_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStaffDatabaseManagement.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(64, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBack.setBounds(142, 716, 297, 62);
		frmStaffDatabaseManagement.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(64, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(1101, 716, 297, 62);
		frmStaffDatabaseManagement.getContentPane().add(btnExit);
	}
}
