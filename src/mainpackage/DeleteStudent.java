package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DeleteStudent {

	private JFrame frmDeleteStudentPage;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private JTextField txtSerialNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
					window.frmDeleteStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteStudentPage = new JFrame();
		frmDeleteStudentPage.setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteStudent.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmDeleteStudentPage.setTitle("Delete Student Page");
		frmDeleteStudentPage.setBounds(250, 50, 1050, 750);
		frmDeleteStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteStudentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Student Entry");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(195, 10, 645, 80);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-33, 102, 1096, 18);
		frmDeleteStudentPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(164, 263, 181, 60);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(164, 352, 181, 60);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_1_1);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLastName.setColumns(10);
		txtLastName.setBounds(386, 357, 454, 55);
		frmDeleteStudentPage.getContentPane().add(txtLastName);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(386, 268, 454, 55);
		frmDeleteStudentPage.getContentPane().add(txtFirstName);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Serial Number to Delete :");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_2.setBounds(48, 130, 578, 60);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_2);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtSerialNumber.setColumns(10);
		txtSerialNumber.setBounds(654, 130, 129, 60);
		frmDeleteStudentPage.getContentPane().add(txtSerialNumber);
		
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
		btnGetData.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGetData.setBounds(846, 130, 129, 60);
		frmDeleteStudentPage.getContentPane().add(btnGetData);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteStudentPage.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(64, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(73, 548, 181, 74);
		frmDeleteStudentPage.getContentPane().add(btnBack);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteStudentPage.setVisible(false);
			}
		});
		btnClose.setForeground(new Color(64, 0, 0));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(764, 548, 187, 74);
		frmDeleteStudentPage.getContentPane().add(btnClose);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int serialNumber = Integer.parseInt(txtSerialNumber.getText());
				
				JDBCHandling db = new JDBCHandling();
				
				int status = db.deleteUpdate(serialNumber);
				
				if(status == 1) {
					JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
				}else {
					JOptionPane.showMessageDialog(null, "Problem in Data Deletion");
				}
				
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtSerialNumber.setText(null);
				
			}
		});
		btnDelete.setForeground(new Color(64, 0, 0));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(424, 548, 187, 74);
		frmDeleteStudentPage.getContentPane().add(btnDelete);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-30, 488, 1096, 18);
		frmDeleteStudentPage.getContentPane().add(separator_1);
	}

}
