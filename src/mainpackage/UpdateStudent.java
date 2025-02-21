package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class UpdateStudent {

	private JFrame frmUpdateStudentPage;
	private JTextField txtSerialNumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent window = new UpdateStudent();
					window.frmUpdateStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateStudentPage = new JFrame();
		frmUpdateStudentPage.setIconImage(Toolkit.getDefaultToolkit().getImage(UpdateStudent.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmUpdateStudentPage.setTitle("Update Student Page");
		frmUpdateStudentPage.setBounds(250, 50, 1050, 750);
		frmUpdateStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateStudentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Serial Number to Update :");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 10, 748, 60);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtSerialNumber.setBounds(770, 21, 123, 49);
		frmUpdateStudentPage.getContentPane().add(txtSerialNumber);
		txtSerialNumber.setColumns(10);
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtAddress.setBounds(376, 295, 453, 107);
		frmUpdateStudentPage.getContentPane().add(txtAddress);
		
		JButton btnGetData = new JButton("Get Data");
		btnGetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(txtSerialNumber.getText());
				
				JDBCHandling db = new JDBCHandling();
				
				ResultSet result =null;
				
				result = db.getRow(number);
				
				try {
					while(result.next()) {
						txtFirstName.setText(result.getString(2));
						txtLastName.setText(result.getString(3));
						txtMobile.setText(result.getString(4));
						txtAddress.setText(result.getString(5));
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
		frmUpdateStudentPage.getContentPane().add(btnGetData);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 86, 1036, 2);
		frmUpdateStudentPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(181, 98, 165, 40);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(181, 161, 165, 40);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile No.");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(181, 222, 165, 40);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel_1_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 609, 1036, 2);
		frmUpdateStudentPage.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(181, 291, 165, 40);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel_1_1_1_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFirstName.setBounds(376, 98, 453, 36);
		frmUpdateStudentPage.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLastName.setColumns(10);
		txtLastName.setBounds(376, 161, 453, 36);
		frmUpdateStudentPage.getContentPane().add(txtLastName);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtMobile.setColumns(10);
		txtMobile.setBounds(376, 222, 453, 36);
		frmUpdateStudentPage.getContentPane().add(txtMobile);
		
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Gender");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2.setBounds(98, 451, 189, 41);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel_1_2_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(326, 451, 276, 41);
		frmUpdateStudentPage.getContentPane().add(panel);
		
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
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Degree");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_1.setBounds(612, 451, 189, 41);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel_1_2_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "ME", "MCA"}));
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 20));
		comboBox.setBounds(810, 451, 201, 41);
		frmUpdateStudentPage.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("D O B");
		lblNewLabel_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_2.setBounds(98, 531, 189, 41);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel_1_2_2_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(326, 531, 276, 41);
		frmUpdateStudentPage.getContentPane().add(dateChooser);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("Subject");
		lblNewLabel_1_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_3.setBounds(612, 531, 189, 41);
		frmUpdateStudentPage.getContentPane().add(lblNewLabel_1_2_2_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA\r\n");
		chckbxNewCheckBox.setForeground(Color.RED);
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(791, 538, 95, 31);
		frmUpdateStudentPage.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxPython = new JCheckBox("PYTHON");
		chckbxPython.setForeground(Color.RED);
		chckbxPython.setFont(new Font("Arial Black", Font.BOLD, 20));
		chckbxPython.setBounds(888, 538, 123, 31);
		frmUpdateStudentPage.getContentPane().add(chckbxPython);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdateStudentPage.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(64, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(36, 621, 169, 50);
		frmUpdateStudentPage.getContentPane().add(btnNewButton_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				
				long mobile = Long.parseLong(txtMobile.getText());
				
				String address = txtAddress.getText();
				
				System.out.println(firstName + lastName + mobile + address);
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
				String date = sdf.format(dateChooser.getDate());
				
				System.out.println(date);
				
				String subject1 = null;
				String subject2 = null;
				
				boolean isSelected = chckbxNewCheckBox.isSelected();
				
				if(isSelected) {
					subject1 = chckbxNewCheckBox.getLabel();
				}
				
				isSelected = chckbxPython.isSelected();
				
				if(isSelected) {
					subject2 = chckbxPython.getLabel();
				}
				
				System.out.println(subject1 + subject2);
				
				String gender = null;
				
				if(rdbtnNewRadioButton.isSelected()) {
					gender = "Male";
				}else if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}
				
				System.out.println(gender);
				
				String degree = null;
				
				degree = (String)comboBox.getSelectedItem();
				
				System.out.println(degree);
				
//				Shifting data to database
				
				JDBCHandling db = new JDBCHandling();
				
				int serialNumber = Integer.parseInt(txtSerialNumber.getText());
				
				int status = db.insertUpdate(firstName,lastName,mobile,address,gender,degree,date,subject1,subject2,serialNumber);
				
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
		btnSave.setBounds(297, 621, 169, 50);
		frmUpdateStudentPage.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobile.setText(null);
				txtAddress.setText(null);
				chckbxNewCheckBox.setSelected(false);
				chckbxPython.setSelected(false);
				dateChooser.setCalendar(null);
			}
		});
		btnReset.setForeground(new Color(64, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(557, 621, 169, 50);
		frmUpdateStudentPage.getContentPane().add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdateStudentPage.setVisible(false);
			}
		});
		btnClose.setForeground(new Color(64, 0, 0));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(816, 621, 169, 50);
		frmUpdateStudentPage.getContentPane().add(btnClose);
	}
}
