package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie6")
public class Cookie6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Cookie background = new Cookie("background",request.getParameter("background"));
		Cookie text = new Cookie("text",request.getParameter("text"));
		
		response.addCookie(background);
		response.addCookie(text);
		
		response.getWriter().append("<body bgcolor=\"").append(request.getParameter("background")).append("\">");
		

	}

}
