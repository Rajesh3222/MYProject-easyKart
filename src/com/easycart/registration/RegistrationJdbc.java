package com.easycart.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Scanner;

public class RegistrationJdbc {

	public static void insertRow(String c_user,String c_email,String c_password) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		String sql="insert into customers values(?,?,?,?)";
		Connection con=null;
		PreparedStatement ps = null;
		String Utype="User";
		
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(sql);
			ps.setString(1,c_user);
			ps.setString(2, c_email);
			ps.setString(3, c_password);
			ps.setString(4, Utype);
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally{
			try {
				con.close();
				
				ps.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//
	}
}

