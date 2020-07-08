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

import Modal.JoinOperation;
import dao.DataAccess;


@WebServlet("/JoinOperationController")
public class JoinOperationController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<JoinOperation> joinoperation = new ArrayList<JoinOperation>();
		try {
			joinoperation = dataAccess.getJoinOperation();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("joinoperations", joinoperation);
        RequestDispatcher rd = request.getRequestDispatcher("views/JoinOperation.jsp");
        rd.forward(request, response);
	}

}
