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

import Modal.MovieDetail;
import dao.DataAccess;


@WebServlet("/MovieDetailController")
public class MovieDetailController extends HttpServlet {
	
		private static final long serialVersionUID = 1L;
		DataAccess dataAccess = new DataAccess();      
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
			List<MovieDetail> moviedetails = new ArrayList<MovieDetail>();
			try {
				moviedetails = dataAccess.getMovieDetail();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("moviedetails", moviedetails);
	        RequestDispatcher rd = request.getRequestDispatcher("views/MovieDetail.jsp");
	        rd.forward(request, response);
		}

}
