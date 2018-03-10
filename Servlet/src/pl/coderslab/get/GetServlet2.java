package pl.coderslab.get;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServlet2
 */
@WebServlet("/GetServlet2")
public class GetServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		Enumeration<String> parameters = request.getParameterNames();
		while(parameters.hasMoreElements()) {
			
			String parameterName = parameters.nextElement();
			String[] parameterValues = request.getParameterValues(parameterName); 
			
			for(int i=0; i<parameterValues.length; i++) { 
				
				response.getWriter().append(parameterName).append(" - ").append(parameterValues[i]).append("<br>");
				
			}
			
		
			
		}
		
	}



}
