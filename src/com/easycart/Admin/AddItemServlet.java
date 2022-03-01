package com.easycart.Admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddItemServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		       String i_name= req.getParameter("itemname");
		       String i_desc=req.getParameter("itemdesc");
		       String i_cost=req.getParameter("itemcost");
		       String i_cat=req.getParameter("itemcat");
		     DBHandler.insertRowForItem(i_name, i_desc, i_cost, i_cat);
		       resp.getWriter().print("Category Added successfully ");
	  }	       
}
