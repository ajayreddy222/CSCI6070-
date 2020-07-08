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

import Modal.Crew;
import dao.DataAccess;

@WebServlet("/CrewController")
public class CrewController  extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<Crew> crews = new ArrayList<Crew>();
		try {
			crews = dataAccess.getCrew();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("crews", crews);
        RequestDispatcher rd = request.getRequestDispatcher("views/Crew.jsp");
        rd.forward(request, response);
	}
}
