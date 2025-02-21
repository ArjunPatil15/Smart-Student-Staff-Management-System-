package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class UpdateStaff {

	private JFrame frmUpdateStaffPage;
	private JTextField txtSerialNumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private JTextField txtSalary;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStaff window = new UpdateStaff();
					window.frmUpdateStaffPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateStaffPage = new JFrame();
		frmUpdateStaffPage.setIconImage(Toolkit.getDefaultToolkit().getImage(UpdateStaff.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmUpdateStaffPage.setTitle("Update Staff Page");
		frmUpdateStaffPage.setBounds(250, 50, 1050, 750);
		frmUpdateStaffPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateStaffPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Serial Number to Update :");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 10, 748, 60);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtSerialNumber.setColumns(10);
		txtSerialNumber.setBounds(768, 20, 123, 49);
		frmUpdateStaffPage.getContentPane().add(txtSerialNumber);
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtAddress.setBounds(415, 320, 453, 105);
		frmUpdateStaffPage.getContentPane().add(txtAddress);
		
		JButton btnGetData = new JButton("Get Data");
		btnGetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(txtSerialNumber.getText());
				
				JDBCHandling db = new JDBCHandling();
				
				ResultSet result =null;
				
				result = db.getRowStaff(number);
				
				try {
					while(result.next()) {
						txtFirstName.setText(result.getString(2));
						txtLastName.setText(result.getString(3));
						txtMobile.setText(result.getString(4));
						txtAddress.setText(result.getString(5));
						txtSalary.setText(result.getString(9));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGetData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGetData.setBounds(908, 21, 118, 49);
		frmUpdateStaffPage.getContentPane().add(btnGetData);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 91, 1036, 2);
		frmUpdateStaffPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(230, 114, 165, 40);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(415, 118, 453, 36);
		frmUpdateStaffPage.getContentPane().add(txtFirstName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(230, 179, 165, 40);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel_1_1);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLastName.setColumns(10);
		txtLastName.setBounds(415, 179, 453, 36);
		frmUpdateStaffPage.getContentPane().add(txtLastName);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile No.");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(230, 244, 165, 40);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel_1_1_1);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtMobile.setColumns(10);
		txtMobile.setBounds(415, 248, 453, 36);
		frmUpdateStaffPage.getContentPane().add(txtMobile);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(230, 320, 165, 40);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Gender");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2.setBounds(83, 456, 189, 41);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel_1_2_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(270, 456, 276, 41);
		frmUpdateStaffPage.getContentPane().add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(6, 6, 104, 29);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 20));
		rdbtnFemale.setBounds(140, 6, 111, 29);
		panel.add(rdbtnFemale);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Department");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_1.setBounds(596, 456, 159, 41);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel_1_2_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"FY", "COMP", "IT", "ENTC", "MECH"}));
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 20));
		comboBox.setBounds(774, 456, 216, 41);
		frmUpdateStaffPage.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Joining Date");
		lblNewLabel_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_2.setBounds(83, 528, 169, 41);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel_1_2_2_2);
		
		JDateChooser joinDate = new JDateChooser();
		joinDate.setDateFormatString("yyyy-MM-dd");
		joinDate.setBounds(270, 528, 276, 41);
		frmUpdateStaffPage.getContentPane().add(joinDate);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("Salary");
		lblNewLabel_1_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_3.setBounds(596, 528, 147, 41);
		frmUpdateStaffPage.getContentPane().add(lblNewLabel_1_2_2_3);
		
		txtSalary = new JTextField();
		txtSalary.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtSalary.setColumns(10);
		txtSalary.setBounds(774, 528, 219, 41);
		frmUpdateStaffPage.getContentPane().add(txtSalary);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 593, 1036, 2);
		frmUpdateStaffPage.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdateStaffPage.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(64, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(31, 611, 169, 50);
		frmUpdateStaffPage.getContentPane().add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				
				long mobile = Long.parseLong(txtMobile.getText());
				
				long salary = Long.parseLong(txtSalary.getText());
				
				String address = txtAddress.getText();
				
				System.out.println(firstName + lastName + mobile + address);
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
				String date = sdf.format(joinDate.getDate());
				
				System.out.println(date);
					
				String gender = null;
				
				if(rdbtnNewRadioButton.isSelected()) {
					gender = "Male";
				}else if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}
				
				System.out.println(gender);
				
				String department = null;
				
				department = (String)comboBox.getSelectedItem();
				
				System.out.println(department);
				
//				Shifting data to database
				
				JDBCHandling db = new JDBCHandling();
				
				int serialNumber = Integer.parseInt(txtSerialNumber.getText());
				
				int status = db.insertUpdateStaff(firstName,lastName,mobile,address,gender,department,date,salary,serialNumber);
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null, "Data Updated");
				}else {
					JOptionPane.showMessageDialog(null, "Problem in Data Updation");
				}
			}
		});
		btnSave.setForeground(new Color(64, 0, 0));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSave.setBackground(Color.WHITE);
		btnSave.setBounds(296, 611, 169, 50);
		frmUpdateStaffPage.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobile.setText(null);
				txtAddress.setText(null);
				joinDate.setCalendar(null);
				txtSalary.setText(null);
			}
		});
		btnReset.setForeground(new Color(64, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(559, 611, 169, 50);
		frmUpdateStaffPage.getContentPane().add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setForeground(new Color(64, 0, 0));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(821, 611, 169, 50);
		frmUpdateStaffPage.getContentPane().add(btnClose);
		

	}
}
