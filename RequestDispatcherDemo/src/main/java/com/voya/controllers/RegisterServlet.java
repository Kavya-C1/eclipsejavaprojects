package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		String employeename = request.getParameter("employeename");
		String city = request.getParameter("city");
		String sal = request.getParameter("salary");
		double salary= Double.parseDouble(sal);
		String mob = request.getParameter("mobile");
		long mobile = Long.parseLong(mob);
		String[] course = request.getParameterValues("course");
		String[] hobbies = request.getParameterValues("hobbies");
		
//		PrintWriter writer = response.getWriter();
//		course
//		writer.print("<html><body>");
//		writer.print("Welcome "+employeeName+"<br>");
//		writer.print("your city is "+city+"<br>");
//		writer.print("your salary is "+salary+"<br>");
//		writer.print("your number is "+mobile+"<br>");
//		for(String course:courses)
//		{
//			writer.print("your course is "+course+"<br>");
//		}
//		for(String hobby:hobbies)
//		{
//			writer.print("your hobby is "+hobby+"<br>");
//		}
//		writer.print("<html><body>");
		
		//set attribute to send the object to the next page
		request.setAttribute("employeename", employeename);
		request.setAttribute("city", city);
		request.setAttribute("salary", salary);
		request.setAttribute("course", course);
		request.setAttribute("mobile", mobile);
		request.setAttribute("hobbies", hobbies);
	PrintWriter writer = response.getWriter();
	writer.print("This is from servlet<br>");
		
		//create the request dispatcher to send to the next page
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
//		dispatcher.include(request, response);
		dispatcher.forward(request, response);
//		response.sendRedirect("success.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
