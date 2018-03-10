package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie3
 */
@WebServlet("/Cookie3")
public class Cookie3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		String duration = request.getParameter("duration");
		
		Cookie c = new Cookie(key, value);
		c.setMaxAge((Integer.parseInt(duration)*60*60));
		response.addCookie(c);
		
		
	}

}
