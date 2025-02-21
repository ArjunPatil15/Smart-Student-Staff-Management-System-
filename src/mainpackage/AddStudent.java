package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class AddStudent {

	private JFrame frmAddStudentPage;
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
					AddStudent window = new AddStudent();
					window.frmAddStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentPage = new JFrame();
		frmAddStudentPage.getContentPane().setFont(new Font("Arial Black", Font.BOLD, 20));
		frmAddStudentPage.getContentPane().setForeground(new Color(64, 0, 0));
		frmAddStudentPage.setIconImage(Toolkit.getDefaultToolkit().getImage(AddStudent.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmAddStudentPage.setTitle("Add Student Page");
		frmAddStudentPage.setBounds(250, 50, 1050, 750);
		frmAddStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Entry Form");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(285, 0, 475, 69);
		frmAddStudentPage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(77, 91, 189, 41);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(76, 67, 884, 14);
		frmAddStudentPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(77, 149, 189, 41);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile No.");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(77, 202, 189, 41);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Address");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_1.setBounds(77, 263, 189, 41);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Gender");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2.setBounds(77, 433, 189, 41);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Degree");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_1.setBounds(571, 433, 189, 41);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("D O B");
		lblNewLabel_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_2.setBounds(77, 526, 189, 41);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("Subject");
		lblNewLabel_1_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2_2_3.setBounds(571, 526, 189, 41);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_2_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 255, 255));
		separator_1.setBounds(76, 589, 884, 14);
		frmAddStudentPage.getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(285, 433, 276, 41);
		frmAddStudentPage.getContentPane().add(panel);
		panel.setLayout(null);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "MCA", "ME"}));
		comboBox.setBounds(750, 433, 201, 41);
		frmAddStudentPage.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA\r\n");
		chckbxNewCheckBox.setForeground(new Color(255, 0, 0));
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(741, 531, 95, 31);
		frmAddStudentPage.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxPython = new JCheckBox("PYTHON");
		chckbxPython.setForeground(new Color(255, 0, 0));
		chckbxPython.setFont(new Font("Arial Black", Font.BOLD, 20));
		chckbxPython.setBounds(837, 531, 123, 31);
		frmAddStudentPage.getContentPane().add(chckbxPython);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(285, 526, 276, 41);
		frmAddStudentPage.getContentPane().add(dateChooser);
		
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setLineWrap(true);
		txtAddress.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtAddress.setBounds(285, 268, 558, 121);
		frmAddStudentPage.getContentPane().add(txtAddress);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudentPage.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(64, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.setBounds(77, 628, 169, 50);
		frmAddStudentPage.getContentPane().add(btnBack);
		
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
				
				int status =db.insertData(firstName, lastName, mobile, address, gender, degree,date, subject1, subject2);
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null, "Student Entry Successful");
				}
				
			}
		});
		btnSave.setForeground(new Color(64, 0, 0));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSave.setBackground(new Color(255, 255, 255));
		btnSave.setBounds(314, 628, 169, 50);
		frmAddStudentPage.getContentPane().add(btnSave);
		
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
		btnReset.setBackground(new Color(255, 255, 255));
		btnReset.setBounds(550, 628, 169, 50);
		frmAddStudentPage.getContentPane().add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudentPage.setVisible(false);
			}
		});
		btnClose.setForeground(new Color(64, 0, 0));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClose.setBackground(new Color(255, 255, 255));
		btnClose.setBounds(791, 628, 169, 50);
		frmAddStudentPage.getContentPane().add(btnClose);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtFirstName.setBounds(287, 91, 558, 41);
		frmAddStudentPage.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtLastName.setColumns(10);
		txtLastName.setBounds(287, 149, 558, 41);
		frmAddStudentPage.getContentPane().add(txtLastName);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtMobile.setColumns(10);
		txtMobile.setBounds(287, 204, 558, 41);
		frmAddStudentPage.getContentPane().add(txtMobile);
	
		
	
		

	}
}
