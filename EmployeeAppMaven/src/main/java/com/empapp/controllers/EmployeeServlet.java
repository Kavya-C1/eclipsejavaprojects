package com.empapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.empapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
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
		
		String employeeName = request.getParameter("employeeName");
		String empId = request.getParameter("employeeId");
		Integer employeeId = Integer.parseInt(empId);
		double salary = Double.parseDouble(request.getParameter("salary"));
		String city = request.getParameter("city");
		
		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		employee.setEmployeeId(employeeId);
		employee.setSalary(salary);
		employee.setCity(city);
		
		
		request.setAttribute("employee", employee);
		request.setAttribute("message", "Great Day");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("message1", "welcome to EL");
		request.setAttribute("message1", "In request Scope");
		RequestDispatcher dispatcher = request.getRequestDispatcher("empexplang.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
