package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie1Get
 */
@WebServlet("/showCookie")
public class Cookie1Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies(); 
		if(cookies == null) { 
			response.getWriter().append("Nie ma takiego ciasteczka"); 
			return;
		}
		
	
		
		for(int i=0; i<cookies.length; i++) { 
			
			if("User".equals(cookies[i].getName())) { 
				
				response.getWriter().append("Wartość ciasteczka User to ").append(cookies[i].getValue()); 				
				return; 
			}
			
			
			
		}
		
		
	}



}
