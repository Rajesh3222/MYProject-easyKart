package com.easycart.ResetPassword;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResetPasswordServlet  extends HttpServlet{
        @Override
     public  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	String email=req.getParameter("email");
        	String password=req.getParameter("password2");
                
	              boolean flag=DBHandler.resetPassWord(email, password);
			if(flag==true){
          resp.getWriter().print(" Congratulations Password updated successfully , login again!");
        }
			else{
				resp.getWriter().print("invalid email, please try again");
			}
        }
 
}
