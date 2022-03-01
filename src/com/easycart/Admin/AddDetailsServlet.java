package com.easycart.Admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddDetailsServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		       String t_customers= req.getParameter("totalcustomers" );
		       String t_cat=req.getParameter("totalcategory");
		       String t_items=req.getParameter("totalitems");
		     DBHandler.insertRowForDetails(t_customers, t_cat,t_items);
		       resp.getWriter().print("Category Added successfully ");
	  }	       

}
