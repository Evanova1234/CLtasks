package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie52
 */
@WebServlet("/Cookie52")
public class Cookie52 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie[] c = request.getCookies(); 
		
		if(c==null) { 
			
			response.getWriter().append("Nie odwiedziłeś jeszcze strony Cookie51! (Brak jakichkolwiek ciasteczek)");
		}
		
		for(int i = 0; i<c.length;i++) { 
			
			if("Cookie51Visited".equals(c[i].getName())) { 
				
				if("true".equals(c[i].getValue())) { 
					
					response.getWriter().append("Witamy na stronie!");
					return; 
					
				}
				
			}
			
		}
		
		response.getWriter().append("Nie odiwedziłeś jeszcze strony Cookie51! (Istnieją jakieś tam ciasteczka)");
		
		
		
	}



}
