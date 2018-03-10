package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post5
 */
@WebServlet("/Post5")
public class Post5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post5() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String degrees = request.getParameter("degrees");
		String convertionType = request.getParameter("convertionType"); 
		double degreesDouble = Double.parseDouble(degrees);
		
		if("celcToFahr".equals(convertionType)) { 
			
			response.getWriter().append(Double.toString(9/5*degreesDouble + 32)); 
			
		} else { 
			
			response.getWriter().append(Double.toString((degreesDouble-32)*5/9));
			
		}
		
		

	}

}
