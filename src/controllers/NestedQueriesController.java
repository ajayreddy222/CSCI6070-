package controllers;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modal.*;
import dao.DataAccess;


@WebServlet("/NestedQueriesController")
public class NestedQueriesController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<NestedQueries> nestedqueries = new ArrayList<NestedQueries>();
		try {
			nestedqueries = dataAccess.getNestedQueries();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("nestedqueriess", nestedqueries);
        RequestDispatcher rd = request.getRequestDispatcher("views/NestedQueries.jsp");
        rd.forward(request, response);
	}	

}
