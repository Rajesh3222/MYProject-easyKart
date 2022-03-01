package com.easycart.Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHandler  {
	public static void insertRowForCategory(String cat_name,String cat_desc){
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String password="system";
	String sql="insert into category  values(?,?)";
	Connection con=null;
	PreparedStatement ps = null;
	
try{
		Class.forName(driver);
		con=DriverManager.getConnection(url, user, password);
		ps=con.prepareStatement(sql);
		ps.setString(1,cat_name);
		ps.setString(2, cat_desc);
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
	}
	public static void insertRowForItem(String i_name,String i_desc,String i_mrp,String i_cat ){
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		String sql="insert into category  values(?,?,?,?)";
		Connection con=null;
		PreparedStatement ps = null;
		
	try{
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(sql);
			ps.setString(1,i_name);
			ps.setString(2, i_desc);
			ps.setString(2, i_mrp);
			ps.setString(4, i_cat);
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
	}
	public static void insertRowForDetails(String d_customers, String d_cat, String d_items){
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		String sql="insert into category  values(?,?,?)";
		Connection con=null;
		PreparedStatement ps = null;
		
	try{
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(sql);
			ps.setString(1,d_customers);
			ps.setString(2, d_cat);
			ps.setString(3, d_items);
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
	}
}

