package com.easycart.ResetPassword;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBHandler {
   
	public static boolean resetPassWord(String name, String password) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "System";
		String password1 = "System";
		Connection con = null;
		PreparedStatement ps = null;
         int res=0;
		String sql = "update  customers  set password=? where email=?";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password1);
			ps = con.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, name);
			res = ps.executeUpdate();

			

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				con.close();
				ps.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (res>=1) {
			return true;
		} else {
			return false;
		}
	}
}
