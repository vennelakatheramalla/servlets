package com.iq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbers extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		int numberOne=Integer.parseInt(req.getParameter("num1"));
		int numberTwo=Integer.parseInt(req.getParameter("num2"));
		int total=numberOne+numberTwo;
		writer.println("total of two numbers:"+total);
		System.out.println("sum of two numbers:"+total);
	
	}
	

}
