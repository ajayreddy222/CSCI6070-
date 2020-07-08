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

import Modal.SetOperation;
import dao.DataAccess;

@WebServlet("/SetOperationController")
public class SetOperationController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<SetOperation> setoperations = new ArrayList<SetOperation>();
		try {
			setoperations = dataAccess.getSetOperation();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("setoperations", setoperations);
        RequestDispatcher rd = request.getRequestDispatcher("views/SetOperation.jsp");
        rd.forward(request, response);
	}

}
