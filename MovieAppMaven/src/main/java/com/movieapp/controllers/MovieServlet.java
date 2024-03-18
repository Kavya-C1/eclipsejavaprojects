package com.movieapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieapp.service.MovieDetails;

/**
 * Servlet implementation class MovieServlet
 */
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieServlet() {
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
		
		HttpSession session = request.getSession(false);
		PrintWriter writer = response.getWriter();
		writer.print("SessionId "+session.getId()+"<br>");
		writer.print("CreationTime "+session.getCreationTime()+"<br>");
		writer.print("MaxInactive "+session.getMaxInactiveInterval()+"<br>");
		
		String language = request.getParameter("language");
		//create an object of movie details
		//call the showMovies method that returns movieList
		//set attribute of movieList to "movies"
		//use request dispatcher to send to final.jsp
		
		 MovieDetails details = new MovieDetails();
		List<String> movies= details.showMovies(language);
		 
		 request.setAttribute("movies", movies);
			RequestDispatcher dispatcher = request.getRequestDispatcher("final.jsp");
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
