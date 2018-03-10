package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServlet
 */
@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		String startString = request.getParameter("start");
		String endString = request.getParameter("end");
		
		if(startString==null || endString==null) { 
			response.getWriter().append("Brak zmiennych");
			return; 
		}
		
		try {
			
			Integer start = Integer.parseInt(startString);
			Integer end = Integer.parseInt(endString);
			
			for(int i=start; i<=end; i++) { 
				
				response.getWriter().append(i+"<br>");
				
			}
			
			
		} catch (NumberFormatException e) { 
			
			response.getWriter().append("Błędne wywołanie parametrów"); 
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
