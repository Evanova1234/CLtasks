package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie4Show
 */
@WebServlet("/Cookie4Show")
public class Cookie4Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie4Show() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Cookie[] cookies = request.getCookies(); 
		
		if(cookies==null) { 
			
			response.getWriter().append("Brak ciasteczek"); 
			
		}
		
		for(int i=0;i<cookies.length;i++) { 
			response.getWriter().append(cookies[i].getName()).append(" - ").append(cookies[i].getValue()).append(" ");
			response.getWriter().append("<a href=\"http://localhost:8080/Servlet/Cookie4del?key=")
								.append(cookies[i].getName())
								.append("\">LINK</a> <br>");
		}				
	}
}
