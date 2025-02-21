package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class AddStaff {

	private JFrame frmAddStaffPage;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStaff window = new AddStaff();
					window.frmAddStaffPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStaffPage = new JFrame();
		frmAddStaffPage.setIconImage(Toolkit.getDefaultToolkit().getImage(AddStaff.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmAddStaffPage.setTitle("Add Staff Page");
		frmAddStaffPage.setBounds(250, 50, 1050, 750);
		frmAddStaffPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStaffPage.getContentPane().setLayout(null);
		
		JLabel lblStaffEntryForm = new JLabel("Staff Entry Form");
		lblStaffEntryForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffEntryForm.setForeground(new Color(0, 64, 128));
		lblStaffEntryForm.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblStaffEntryForm.setBounds(317, 0, 475, 69);
		frmAddStaffPage.getContentPane().add(lblStaffEntryForm);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(76, 69, 884, 14);
		frmAddStaffPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(137, 93, 189, 41);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(346, 95, 558, 41);
		frmAddStaffPage.getContentPane().add(txtFirstName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(137, 161, 189, 41);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_1);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtLastName.setColumns(10);
		txtLastName.setBounds(346, 163, 558, 41);
		frmAddStaffPage.getContentPane().add(txtLastName);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile No.");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(137, 230, 189, 41);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_2);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtMobile.setColumns(10);
		txtMobile.setBounds(346, 232, 558, 41);
		frmAddStaffPage.getContentPane().add(txtMobile);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Address");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_1.setBounds(137, 306, 189, 41);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_2_1);
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setLineWrap(true);
		txtAddress.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtAddress.setBounds(346, 306, 558, 121);
		frmAddStaffPage.getContentPane().add(txtAddress);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Gender");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2.setBounds(75, 452, 132, 41);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_2_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(253, 452, 276, 41);
		frmAddStaffPage.getContentPane().add(panel);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMale.setFont(new Font("Arial Black", Font.BOLD, 20));
		rdbtnMale.setBounds(6, 6, 104, 29);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 20));
		rdbtnFemale.setBounds(139, 6, 111, 29);
		panel.add(rdbtnFemale);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Department");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_1.setBounds(553, 452, 159, 41);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_2_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"FY", "COMP", "IT", "ENTC", "MECH"}));
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 20));
		comboBox.setBounds(744, 454, 216, 41);
		frmAddStaffPage.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Joining Date");
		lblNewLabel_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_2.setBounds(58, 517, 169, 41);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_2_2_2);
		
		JDateChooser joinDate = new JDateChooser();
		joinDate.setDateFormatString("yyyy-MM-dd");
		joinDate.setBounds(253, 517, 276, 41);
		frmAddStaffPage.getContentPane().add(joinDate);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("Salary");
		lblNewLabel_1_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_3.setBounds(553, 517, 147, 41);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_2_2_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(76, 603, 884, 14);
		frmAddStaffPage.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStaffPage.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(64, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(86, 627, 169, 50);
		frmAddStaffPage.getContentPane().add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				
				long mobile = Long.parseLong(txtMobile.getText());
				
				long salary = Long.parseLong(txtSalary.getText());
				
				String address = txtAddress.getText();
				
				System.out.println(firstName + lastName + mobile + address  + salary);
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
				String date = sdf.format(joinDate.getDate());
				
				System.out.println(date);
				
				String gender = null;
				
				if(rdbtnMale.isSelected()) {
					gender = "Male";
				}else if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}
				
				System.out.println(gender);
				
				String department = null;
				
				department = (String)comboBox.getSelectedItem();
				
				System.out.println(department);
				
//				for database Handling
				
				JDBCHandling db = new JDBCHandling();
				
				int status =db.insertStaff(firstName, lastName, mobile, address, gender, department,date, salary);
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null, "Staff Entry Successful");
				}
			}
		});
		btnSave.setForeground(new Color(64, 0, 0));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSave.setBackground(Color.WHITE);
		btnSave.setBounds(335, 627, 169, 50);
		frmAddStaffPage.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobile.setText(null);
				txtSalary.setText(null);
				txtAddress.setText(null);
				joinDate.setCalendar(null);
			}
		});
		btnReset.setForeground(new Color(64, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(561, 627, 169, 50);
		frmAddStaffPage.getContentPane().add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setForeground(new Color(64, 0, 0));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(791, 627, 169, 50);
		frmAddStaffPage.getContentPane().add(btnClose);
		
		txtSalary = new JTextField();
		txtSalary.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtSalary.setColumns(10);
		txtSalary.setBounds(741, 519, 219, 41);
		frmAddStaffPage.getContentPane().add(txtSalary);
	}
}
