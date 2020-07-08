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


@WebServlet("/AkasController")
public class AkasController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<Akas> akas = new ArrayList<Akas>();
		try {
			akas = dataAccess.getAkas();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("akass", akas);
        RequestDispatcher rd = request.getRequestDispatcher("views/Akas.jsp");
        rd.forward(request, response);
	}
	
}
