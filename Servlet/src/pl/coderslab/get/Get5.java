package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get5
 */
@WebServlet("/Get5")
public class Get5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Get5() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");

		String[] parameterValues = request.getParameterValues("company");
		response.getWriter().append("Companies:").append("<br>");
		
		for(int i=0; i < parameterValues.length; i++) { 
			response.getWriter().append(" - ").append(parameterValues[i]).append("<br>");
		}

		
		parameterValues = request.getParameterValues("learn");
		response.getWriter().append("Learn:").append("<br>");
		
		for(int i=0; i < parameterValues.length; i++) { 
			response.getWriter().append(" - ").append(parameterValues[i]).append("<br>");
		}
		
	}


}
