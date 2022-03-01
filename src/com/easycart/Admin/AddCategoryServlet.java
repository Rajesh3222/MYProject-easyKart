package com.easycart.Admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddCategoryServlet extends HttpServlet {
		  @Override
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			       String cat_name= req.getParameter("catname" );
			       String cat_desc=req.getParameter("catdesc");
			     DBHandler.insertRowForCategory(cat_name, cat_desc);
			       resp.getWriter().print("Category Added successfully ");
		  }	       

	}

