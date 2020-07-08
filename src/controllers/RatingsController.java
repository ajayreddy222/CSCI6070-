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

import Modal.Rating;
import dao.DataAccess;

@WebServlet("/RatingsController")
public class RatingsController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<Rating> ratings = new ArrayList<Rating>();
		try {
			ratings = dataAccess.getRating();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("ratings", ratings);
        RequestDispatcher rd = request.getRequestDispatcher("views/Rating.jsp");
        rd.forward(request, response);
	}
}