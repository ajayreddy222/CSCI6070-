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

import Modal.TopRatedTVseries;
import dao.DataAccess;


@WebServlet("/TopRatedTVseriesController")
public class TopRatedTVseriesController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<TopRatedTVseries> tvseriess = new ArrayList<TopRatedTVseries>();
		try {
			tvseriess = dataAccess.getTopRatedTVseries();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("tvseriess", tvseriess);
        RequestDispatcher rd = request.getRequestDispatcher("views/TopRatedTVseries.jsp");
        rd.forward(request, response);
	}

}
