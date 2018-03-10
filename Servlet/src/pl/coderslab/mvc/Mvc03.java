package pl.coderslab.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc03
 */
@WebServlet("/Mvc03")
public class Mvc03 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/WEB-INF/book-form.html").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Book bookInstance = new Book();
		
		bookInstance.setTitle(request.getParameter("title"));
		bookInstance.setAuthor(request.getParameter("author"));
		bookInstance.setIsbn(request.getParameter("isbn"));
		
		request.setAttribute("title", bookInstance.getTitle());
		request.setAttribute("author", bookInstance.getAuthor());
		request.setAttribute("isbn", bookInstance.getIsbn());
		
		getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
		
		
	}

}
