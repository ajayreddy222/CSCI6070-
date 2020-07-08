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

import Modal.Episode;
import dao.DataAccess;


@WebServlet("/EpisodeController")
public class EpisodeController extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<Episode> episodes = new ArrayList<Episode>();
		try {
			episodes = dataAccess.getEpisode();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("episodes", episodes);
        RequestDispatcher rd = request.getRequestDispatcher("views/Episode.jsp");
        rd.forward(request, response);
	}
}
