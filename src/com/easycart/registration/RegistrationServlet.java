package com.easycart.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	  @Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		       String c_name= req.getParameter("uname");
		       String c_email=req.getParameter("mail");
		       String c_password = req.getParameter("pass");
		       RegistrationJdbc.insertRow(c_name, c_email, c_password);
		       resp.getWriter().print("Congratulations, registeration successfull ");
	  }	       

}
