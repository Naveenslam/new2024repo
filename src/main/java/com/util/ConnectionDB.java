package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {

	public static void main(String args[]) {
		
		
		try {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			try {
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","HR","admin");
				
				  Statement st=con.createStatement();

				  ResultSet rs=st.executeQuery("select * from students");
				  
				  while(rs.next())

				  {

				  System.out.println("stuName: "+rs.getString(1)+", RollNo: "+rs.getInt(2));

				  }
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}



public void insertNewUser(String username, String password)  //String email

{

String url="jdbc:oracle:thin:@localhost:1521";

String dbuser="hr";

String dbpwd="admin";

try {

 Class.forName("oracle.jdbc.driver.OracleDriver");

 Connection con=DriverManager.getConnection(url,dbuser,dbpwd);

 PreparedStatement ps=con.prepareStatement("insert into registerusers values(?,?)"); //?

 ps.setString(1, username);

 ps.setString(2, password);

// ps.setString(3, email);

 ps.executeUpdate();

 con.close();

} catch (Exception e) {

 e.printStackTrace();
}
}
}