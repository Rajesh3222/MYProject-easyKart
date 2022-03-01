package com.easycart.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.easycart.registration.RegistrationJdbc;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "system";
		String sql = "select * from customers";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Statement st = null;
		int x = 0;

		try {

			String c_email = req.getParameter("email");
			String c_password = req.getParameter("pass");
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();

			rs = st.executeQuery(sql);

			while (rs.next()) {
				if (rs.getString("email").equals(c_email) && rs.getString("password").equals(c_password)) {

					String stp = rs.getString("utype");
					System.out.println(stp);
					if (stp.equals("Admin")) {
						x = 1;
						break;
					}

					else {
						x = 2;
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				con.close();
				st.close();
				rs.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
		if (x == 1) {
			resp.sendRedirect("Admin.html");

		} else if (x == 2) {
			resp.getWriter().print("Login Successfull");

		} else {
			resp.getWriter().print("Wrong credentials , try again!");

		}

	}

}
