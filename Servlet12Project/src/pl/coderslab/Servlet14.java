package pl.coderslab;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet14")
public class Servlet14 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet14() {
        super();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String headerName; 
		response.setContentType("text/html"); 
		Enumeration<String> e = request.getHeaderNames();
		while(e.hasMoreElements()) { 
			headerName = e.nextElement();
			response.getWriter().append(headerName+": "+request.getHeader(headerName)+"\n"+"<br>");			
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
