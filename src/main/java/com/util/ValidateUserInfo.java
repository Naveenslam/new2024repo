package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


////12/29/2023 new data retrieve method from db


public class ValidateUserInfo {
	
	String url="jdbc:oracle:thin:@localhost:1521:";
	
	String dpuser="hr";
	String dppassword="admin";
	
	public boolean userCheck(String user,String password) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url,dpuser,dppassword);
		
		PreparedStatement st=con.prepareStatement("select * from students where Username=? and password=?");  //student username and pass check
		
		st.setString(1, user);
		st.setString(2, password);
		
		ResultSet r=st.executeQuery();
		
		if(r.next())
		{
			return true;
		}
		else {
			return false;
			
			
		}
	
		
		
	}

	
}
