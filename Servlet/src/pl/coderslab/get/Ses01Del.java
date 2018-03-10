package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Ses01Del
 */
@WebServlet("/Ses01Del")
public class Ses01Del extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sess = request.getSession();
		Object countr = sess.getAttribute("counter");
		
		if(countr==null) { 
			
			response.getWriter().append("Brak countera"); 
			
		} else { 
			
			
			sess.removeAttribute("counter");
			response.getWriter().append("Usunięto counter");
			
		}
		
		
	}


}
