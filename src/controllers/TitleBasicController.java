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

import Modal.TitleBasic;
import dao.DataAccess;


@WebServlet("/TitleBasicController")
public class TitleBasicController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DataAccess dataAccess = new DataAccess();      
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		List<TitleBasic> titlebasics = new ArrayList<TitleBasic>();
		try {
			titlebasics = dataAccess.getTitleBasic();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("titlebasics", titlebasics);
        RequestDispatcher rd = request.getRequestDispatcher("views/TitleBasic.jsp");
        rd.forward(request, response);
	}
}