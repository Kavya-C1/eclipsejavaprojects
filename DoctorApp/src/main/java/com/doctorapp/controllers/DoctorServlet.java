package com.doctorapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/doctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
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
		
		String doctorName =  request.getParameter("doctorName");
		Integer doctorId = Integer.parseInt(request.getParameter("doctorId"));
		
		String[] speciality = request.getParameterValues("speciality");
		
		Integer fees = Integer.parseInt(request.getParameter("fees"));
		Integer ratings = Integer.parseInt(request.getParameter("ratings"));
		Integer experience = Integer.parseInt(request.getParameter("experience"));
		
		
		
		request.setAttribute("doctorName", doctorName);
		request.setAttribute("doctorId", doctorId);
		request.setAttribute("speciality", speciality);
		request.setAttribute("fees", fees);
		request.setAttribute("ratings",ratings);
		request.setAttribute("experience", experience);
	PrintWriter writer = response.getWriter();
	writer.print("This is from servlet<br>");

	
	response.sendRedirect("success.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
