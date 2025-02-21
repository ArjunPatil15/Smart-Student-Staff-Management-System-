package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ShowStaff {

	private JFrame frmShowStaff;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStaff window = new ShowStaff();
					window.frmShowStaff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShowStaff = new JFrame();
		frmShowStaff.setIconImage(Toolkit.getDefaultToolkit().getImage(ShowStaff.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmShowStaff.setTitle("Show Staff");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = (int)dim.getWidth();
		int height = (int)dim.getHeight();
		frmShowStaff.setSize((int)width,(int)height);
		frmShowStaff.setLocationRelativeTo(null);
		
//		frmShowStaff.setBounds(100, 100, 450, 300);
		frmShowStaff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShowStaff.getContentPane().setLayout(null);
		
		JLabel lblStaffDatabase = new JLabel("Staff Database");
		lblStaffDatabase.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffDatabase.setForeground(new Color(0, 64, 128));
		lblStaffDatabase.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblStaffDatabase.setBounds(503, 10, 507, 58);
		frmShowStaff.getContentPane().add(lblStaffDatabase);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(87, 78, 1348, 7);
		frmShowStaff.getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(87, 95, 1359, 577);
		frmShowStaff.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 255));
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					 "Serial no.","First Name", "Last Name", "Mobile No.", "Address","Gender", "Department", "Joining Date", "Salary", 
			}
		));
		scrollPane.setViewportView(table);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(87, 694, 1348, 7);
		frmShowStaff.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmShowStaff.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBack.setBounds(155, 722, 217, 58);
		frmShowStaff.getContentPane().add(btnBack);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JDBCHandling db = new JDBCHandling();
				ResultSet result = db.getStaffTable();
				
				DefaultTableModel model = new DefaultTableModel();
				String[] columnNames = {"Serial no.","First Name", "Last Name", "Mobile No.", "Address","Gender", "Department", "Joining Date", "Salary"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[]{
							result.getInt(1),
							result.getString(2),
							result.getString(3),
							result.getLong(4),
							result.getString(5),
							result.getString(6),
							result.getString(7),
							result.getString(8),
							result.getLong(9)
							
						});
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPrint.setBounds(652, 722, 217, 58);
		frmShowStaff.getContentPane().add(btnPrint);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnClose.setBounds(1151, 722, 217, 58);
		frmShowStaff.getContentPane().add(btnClose);
	}
}
