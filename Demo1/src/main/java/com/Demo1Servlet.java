 package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Demo1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public Demo1Servlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text");
	
		int n1= Integer.parseInt(request.getParameter("number 1"));
		int n2= Integer.parseInt(request.getParameter("number 2"));
		
		//int n1=request.getParameter("number 1");
		
		//int d=request.getParameter("Number 2");
		int add= n1+n2;
		
		out.print(add);
	}

}
