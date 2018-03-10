package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie1Del
 */
@WebServlet("/Cookie1Del")
public class Cookie1Del extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Cookie[] cookies = request.getCookies(); 
		
		if(cookies == null) { 
			System.out.println("Brak jakichkolwiek ciasteczek");
			return; 
		}
		
		for(int i=0; i<cookies.length; i++) { 
			
			if("User".equals(cookies[i].getName())) { 
				
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
				response.getWriter().append("Usunieto ciasteczko");
				return; 
			}
			
		}
		
		response.getWriter().append("Nie znaleziono ciasteczka"); 
		
		
	}

}
