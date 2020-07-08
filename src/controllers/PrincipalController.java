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

import Modal.Principal;
import dao.DataAccess;

@WebServlet("/PrincipalController")
public class PrincipalController  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<Principal> principals = new ArrayList<Principal>();
		try {
			principals = dataAccess.getPrincipal();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("principals", principals);
        RequestDispatcher rd = request.getRequestDispatcher("views/Principal.jsp");
        rd.forward(request, response);
	}
}