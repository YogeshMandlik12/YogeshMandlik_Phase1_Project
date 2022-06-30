package phase1project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Phase1Project {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub

		String dbUrl ="jdbc:mysql://localhost:3306/Amazon"; //database
		//localhost:3306 - IP address 3306-port number 
		String username="root";
		String password="root";
		String query= "Select * from Products";    //table retriew all rows
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next())
		{
		System.out.print("Sr.No.:"  +"\t"+"\t"+rs.getString("SrNo") +"\t"+"\n");
		System.out.print("Brand:"  +"\t"+"\t"+rs.getString("Brand") +"\t"+"\n");
		System.out.print("Model Name:"  +"\t"+rs.getString("Model_Name") +"\t"+"\n");
		System.out.print("Price:"  +"\t"+"\t"+rs.getString("Price") +"\t"+"\n");
		System.out.println("\n");
		}
	}

}
