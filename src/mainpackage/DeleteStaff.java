package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DeleteStaff {

	private JFrame frmDeleteStaffPage;
	private JTextField txtSerialNumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStaff window = new DeleteStaff();
					window.frmDeleteStaffPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteStaffPage = new JFrame();
		frmDeleteStaffPage.setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteStaff.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmDeleteStaffPage.setTitle("Delete Staff Page");
		frmDeleteStaffPage.setBounds(250, 50, 1050, 750);
		frmDeleteStaffPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteStaffPage.getContentPane().setLayout(null);
		
		JLabel lblDeleteStaffEntry = new JLabel("Delete Staff Entry");
		lblDeleteStaffEntry.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteStaffEntry.setForeground(new Color(0, 64, 128));
		lblDeleteStaffEntry.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblDeleteStaffEntry.setBounds(187, 10, 645, 80);
		frmDeleteStaffPage.getContentPane().add(lblDeleteStaffEntry);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-30, 100, 1096, 18);
		frmDeleteStaffPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Serial Number to Delete :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_2.setBounds(21, 128, 578, 60);
		frmDeleteStaffPage.getContentPane().add(lblNewLabel_2);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtSerialNumber.setColumns(10);
		txtSerialNumber.setBounds(660, 128, 129, 60);
		frmDeleteStaffPage.getContentPane().add(txtSerialNumber);
		
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
		btnGetData.setBounds(863, 128, 129, 60);
		frmDeleteStaffPage.getContentPane().add(btnGetData);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(133, 263, 181, 60);
		frmDeleteStaffPage.getContentPane().add(lblNewLabel_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(363, 270, 454, 55);
		frmDeleteStaffPage.getContentPane().add(txtFirstName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(133, 371, 181, 60);
		frmDeleteStaffPage.getContentPane().add(lblNewLabel_1_1);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLastName.setColumns(10);
		txtLastName.setBounds(363, 376, 454, 55);
		frmDeleteStaffPage.getContentPane().add(txtLastName);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-30, 508, 1096, 18);
		frmDeleteStaffPage.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteStaffPage.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(64, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(83, 556, 181, 74);
		frmDeleteStaffPage.getContentPane().add(btnBack);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int serialNumber = Integer.parseInt(txtSerialNumber.getText());

				
				JDBCHandling db = new JDBCHandling();
				
				int status = db.deleteStaff(serialNumber);
				
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
		btnDelete.setBounds(424, 556, 187, 74);
		frmDeleteStaffPage.getContentPane().add(btnDelete);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setForeground(new Color(64, 0, 0));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(763, 556, 187, 74);
		frmDeleteStaffPage.getContentPane().add(btnClose);
	}
}
