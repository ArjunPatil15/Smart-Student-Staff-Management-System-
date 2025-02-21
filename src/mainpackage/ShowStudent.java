package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ShowStudent {

	private JFrame frmShowstudent;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStudent window = new ShowStudent();
					window.frmShowstudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShowstudent = new JFrame();
		frmShowstudent.setTitle("Show Student");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = (int)dim.getWidth();
		int height = (int)dim.getHeight();
		frmShowstudent.setSize((int)width,(int)height);
		frmShowstudent.setLocationRelativeTo(null);
		
//		frmShowstudent.setBounds(100, 100, 450, 300);
		frmShowstudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShowstudent.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(508, 10, 507, 58);
		frmShowstudent.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(83, 95, 1348, 7);
		frmShowstudent.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(83, 699, 1348, 7);
		frmShowstudent.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmShowstudent.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBack.setBounds(114, 716, 217, 58);
		frmShowstudent.getContentPane().add(btnBack);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDBCHandling db = new JDBCHandling();
				ResultSet result = db.getTable();
				
				DefaultTableModel model = new DefaultTableModel();
				String[] columnNames = {"Serial no.","First Name", "Last Name", "Mobile No.", "Address","Gender", "Degree", "D O B", "Subject 1", "Subject 2"};
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
							result.getString(9),
							result.getString(10),
							
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
		btnPrint.setBounds(642, 716, 217, 58);
		frmShowstudent.getContentPane().add(btnPrint);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmShowstudent.setVisible(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnClose.setBounds(1167, 716, 217, 58);
		frmShowstudent.getContentPane().add(btnClose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 112, 1359, 577);
		frmShowstudent.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 255));
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					 "Serial no.","First Name", "Last Name", "Mobile No.", "Address","Gender", "Degree", "D O B", "Subject 1", "Subject 2"
			}
		));
		scrollPane.setViewportView(table);
	}
}
