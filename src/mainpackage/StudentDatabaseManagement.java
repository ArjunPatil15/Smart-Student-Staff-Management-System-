package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class StudentDatabaseManagement {

	private JFrame frmStudentDatabaseManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDatabaseManagement window = new StudentDatabaseManagement();
					window.frmStudentDatabaseManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDatabaseManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDatabaseManagement = new JFrame();
		frmStudentDatabaseManagement.setIconImage(Toolkit.getDefaultToolkit().getImage(StudentDatabaseManagement.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmStudentDatabaseManagement.setTitle("StudentDatabaseManagement");
		

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = (int)dim.getWidth();
		int height = (int)dim.getHeight();
		frmStudentDatabaseManagement.setSize((int)width,(int)height);
		frmStudentDatabaseManagement.setLocationRelativeTo(null);
		
//		frmStudentDatabaseManagement.setBounds(100, 100, 450, 300);
		frmStudentDatabaseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentDatabaseManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database Management");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(423, 10, 676, 73);
		frmStudentDatabaseManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(142, 78, 1238, 14);
		frmStudentDatabaseManagement.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(180, 81, 1151, 627);
		frmStudentDatabaseManagement.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 AddStudent.main(null);
			}
		});
		btnAdd.setIcon(new ImageIcon(StudentDatabaseManagement.class.getResource("/Images/ADD.jpg")));
		btnAdd.setBounds(83, 20, 386, 242);
		panel.add(btnAdd);
		
		JButton btnShow = new JButton("");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowStudent.main(null);
			}
		});
		btnShow.setIcon(new ImageIcon("D:\\Java workspace\\MyProject\\src\\Images\\Display.png"));
		btnShow.setBounds(652, 20, 386, 242);
		panel.add(btnShow);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent.main(null);
			}
		});
		btnUpdate.setIcon(new ImageIcon("D:\\Java workspace\\MyProject\\src\\Images\\Update.png"));
		btnUpdate.setBounds(83, 330, 386, 242);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(null);
			}
		});
		btnDelete.setIcon(new ImageIcon(StudentDatabaseManagement.class.getResource("/Images/Delete.jpg")));
		btnDelete.setBounds(652, 330, 386, 242);
		panel.add(btnDelete);
		
		JLabel lblNewLabel_1 = new JLabel("ADD Student");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(187, 272, 161, 38);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Show Students");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(759, 272, 189, 38);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Update Student");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(156, 582, 220, 38);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Delete Student");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(759, 582, 202, 38);
		panel.add(lblNewLabel_1_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentDatabaseManagement.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(64, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBack.setBounds(108, 718, 297, 62);
		frmStudentDatabaseManagement.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(64, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(1083, 718, 297, 62);
		frmStudentDatabaseManagement.getContentPane().add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(142, 708, 1238, 14);
		frmStudentDatabaseManagement.getContentPane().add(separator_1);
	}
}
