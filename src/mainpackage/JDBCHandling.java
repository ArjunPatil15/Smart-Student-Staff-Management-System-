package mainpackage;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHandling {
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet result = null;
	
	JDBCHandling(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("WOW : Got Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skndatabase","root","qwerty123");
			System.out.println("Connetion Ho gaya");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	int insertData (String firstName,String lastName,long mobile ,String address,String gender ,String degree ,String dob,String subject1,String subject2) {
		int status =0;
	
//		String query = "insert into studenttable values(default,?,?,?,?,?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement("insert into studenttable values(default,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setLong(3, mobile);
			pstmt.setString(4, address);
			pstmt.setString(5, gender);
			pstmt.setString(6, degree);
			pstmt.setString(7, dob);
			pstmt.setString(8, subject1);
			pstmt.setString(9, subject2);
			
			status = pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}
	
	
	ResultSet getTable() {
		
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		try {
			result = stmt.executeQuery("select * from studenttable");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}




	public ResultSet getRow(int serialNumber) {
		// TODO Auto-generated method stub
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "select * from studenttable where srNumber = "+serialNumber;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}




	public int insertUpdate(String firstName, String lastName, long mobile, String address, String gender,
			String degree, String date, String subject1, String subject2, int serialNumber) {
		// TODO Auto-generated method stub
		
			int status = 0;
		
		try {
			
			pstmt = con.prepareStatement("update studenttable set firstName = ? ,lastName = ?, mobile = ?, address = ?, gender = ? ,degree = ?, dob = ?,  subject1 = ?,  subject2 = ? where srNumber = ?");
			
			
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setLong(3, mobile);
			pstmt.setString(4, address);
			pstmt.setString(5, gender);
			pstmt.setString(6, degree);
			pstmt.setString(7, date);
			pstmt.setString(8, subject1);
			pstmt.setString(9, subject2);
			pstmt.setInt(10, serialNumber);
			
			status = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return status;	
	
	}




	public int deleteUpdate(int serialNumber) {
		// TODO Auto-generated method stub
		
		int status = 0;
		
		try {
			pstmt = con.prepareStatement("delete from studenttable where srNumber = ?");
			pstmt.setInt(1, serialNumber);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}



//                 --------------------- Method to insert staff---------------------------------------
	
	
	public int insertStaff(String firstName,String lastName,long mobile ,String address,String gender ,String department ,String joinDate,long salary) {
		// TODO Auto-generated method stub
		int status = 0;
		
		
		try {
			pstmt = con.prepareStatement("insert into stafftable values(default,?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setLong(3, mobile);
			pstmt.setString(4, address);
			pstmt.setString(5, gender);
			pstmt.setString(6, department);
			pstmt.setString(7, joinDate);
			pstmt.setLong(8, salary);
			
			
			status = pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return status;
	}




	public int deleteStaff(int serialNumber) {
		// TODO Auto-generated method stub
		int status = 0;
		
		try {
			pstmt = con.prepareStatement("delete from stafftable where srNumber = ?");
			pstmt.setInt(1, serialNumber);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}


	public ResultSet getRowStaff(int serialNumber) {
		// TODO Auto-generated method stub
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "select * from stafftable where srNumber = "+serialNumber;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}




	public int insertUpdateStaff(String firstName, String lastName, long mobile, String address, String gender,
			String department, String date,long salary, int serialNumber) {
		// TODO Auto-generated method stub
		
		int status = 0;
		
	try {
		
		pstmt = con.prepareStatement("update stafftable set firstName = ? ,lastName = ?, mobile = ?, address = ?, gender = ? ,department = ?, joindate = ?,  salary = ? where srNumber = ?");
		
		
		pstmt.setString(1, firstName);
		pstmt.setString(2, lastName);
		pstmt.setLong(3, mobile);
		pstmt.setString(4, address);
		pstmt.setString(5, gender);
		pstmt.setString(6, department);
		pstmt.setString(7, date);
		pstmt.setLong(8, salary);
		pstmt.setInt(9, serialNumber);
		
		status = pstmt.executeUpdate();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	return status;	

		
	}

	ResultSet getStaffTable() {
		
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		try {
			result = stmt.executeQuery("select * from stafftable");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
