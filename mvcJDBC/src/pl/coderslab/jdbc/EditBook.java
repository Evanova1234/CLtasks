package pl.coderslab.jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditBook
 */
@WebServlet("/EditBook")
public class EditBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		System.out.println(id);
		Book editedBook;
		try {
			editedBook = BookDAO.retrieveSpecificBook(id);
			request.setAttribute("editedBook", editedBook);
			getServletContext().getRequestDispatcher("/WEB-INF/book-edit.jsp").forward(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Book postEditBook = new Book(request.getParameter("id"), request.getParameter("title"), request.getParameter("author"), request.getParameter("isbn"));
		response.getWriter().append(postEditBook.getAuthor()
							+" "+postEditBook.getTitle()
							+" "+postEditBook.getId());
		try {
			boolean success = BookDAO.updateSpecificBook(postEditBook);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
