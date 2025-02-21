package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frmSknCollege;
	private JTextField txtLoginName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmSknCollege.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSknCollege = new JFrame();
		frmSknCollege.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/Images/Sinhgad Institutes_Black.png")));
		frmSknCollege.setTitle("SKN College of Engineering");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = (int)dim.getWidth();
		int height = (int)dim.getHeight();
		frmSknCollege.setSize(width/2, height/2);
		frmSknCollege.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmSknCollege.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSknCollege.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SKN College of Engineering\r\n");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(0, 10, 754, 60);
		frmSknCollege.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 94, 764, 16);
		frmSknCollege.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(0, 124, 256, 37);
		frmSknCollege.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password\r\n");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(7, 199, 256, 47);
		frmSknCollege.getContentPane().add(lblNewLabel_1_1);
		
		txtLoginName = new JTextField();
		txtLoginName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLoginName.setBounds(273, 124, 429, 37);
		frmSknCollege.getContentPane().add(txtLoginName);
		txtLoginName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPassword.setBounds(273, 209, 429, 37);
		frmSknCollege.getContentPane().add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 284, 764, 16);
		frmSknCollege.getContentPane().add(separator_1);
		
		JButton btnLogin = new JButton("Login\r\n");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loginName = txtLoginName.getText();
				String password = txtPassword.getText();
				
//				int password = Integer.parseInt(password);
//				System.out.println(loginName + " "+ password);
				
				if(loginName.equals("SKNCOE")&&password.equals("Expert123")){
						//System.out.println("WOW : You are a valid user ");
					
						MainEntryPage.main(null);
//						frmSknCollege.setVisible(false);
						
				}else {
					JOptionPane.showMessageDialog(null,"Invalid User");
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnLogin.setBounds(43, 310, 185, 47);
		frmSknCollege.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLoginName.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(292, 310, 185, 47);
		frmSknCollege.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(537, 310, 185, 47);
		frmSknCollege.getContentPane().add(btnExit);
	}
}
