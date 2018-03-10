package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get3
 */
@WebServlet("/Get3")
public class Get3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Get3() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String height = request.getParameter("height");
		String width = request.getParameter("width");
		
		if(height==null) {
			height = "10";					
		}
		
		if(width==null) { 
			width = "5"; 
		}
		
		try {
			
			Integer heightInt = Integer.parseInt(height);
			Integer widthInt = Integer.parseInt(width);
			
			for(int i = 1; i <= heightInt; i++) {
				
				for(int j=1; j<=widthInt; j++) { 
					
					response.getWriter().append(Integer.toString(j*i)).append(" "); 
					
				}
			
				response.getWriter().append("<br>");
			}
				
			
		} catch (NumberFormatException e) {
			
			response.getWriter().append("Nieprawidłowy format parametrów"); 
			
		}
		
			
			
			
			
		}
			
			
		
		
		
	}




