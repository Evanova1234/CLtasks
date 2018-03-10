package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie4del
 */
@WebServlet("/Cookie4del")
public class Cookie4del extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String key = request.getParameter("key").toString();
		Cookie[] cookies = request.getCookies();
		
		if(cookies==null) { 
			response.getWriter().append("Brak jakichkolwiek ciasteczek");
		}
		
		for(int i = 0 ; i<cookies.length; i++) { 
			
			if(key.equals(cookies[i].getName())) { 
				
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
				response.getWriter().append("Usunięto ciasteczko");
				return; 
				
			}
			
			
		}
		
		response.getWriter().append("Nie znaleziono podanego ciasteczka");
		
		
		
	}



}
