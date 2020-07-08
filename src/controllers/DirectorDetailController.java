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

import Modal.DirectorDetail;
import dao.DataAccess;


@WebServlet("/DirectorDetailController")
public class DirectorDetailController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<DirectorDetail> directordetails = new ArrayList<DirectorDetail>();
		try {
			directordetails = dataAccess.getDirectorDetail();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("directordetails", directordetails);
        RequestDispatcher rd = request.getRequestDispatcher("views/DirectorDetail.jsp");
        rd.forward(request, response);
	}

}
