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

import Modal.Basic;
import dao.DataAccess;

@WebServlet("/BasicsController")
public class BasicsController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<Basic> basics = new ArrayList<Basic>();
		try {
			basics = dataAccess.getBasic();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("basics", basics);
        RequestDispatcher rd = request.getRequestDispatcher("views/Basic.jsp");
        rd.forward(request, response);
	}
}
