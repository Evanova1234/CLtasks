package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie51
 */
@WebServlet("/Cookie51")
public class Cookie51 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Cookie c = new Cookie("Cookie51Visited","true");
		response.addCookie(c);
		response.getWriter().append("<a href=\"http://localhost:8080/Servlet/Cookie52\">LINK</a>");
	}


}
