package pl.coderslab.get;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post4
 */
@WebServlet("/Post4")
public class Post4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");	
		Random rn = new Random();
		int numberOfParameters = rn.nextInt(9);
		
		response.getWriter().append("<form action='Post4' method='post'>");

		for(int i=0; i<=numberOfParameters; i++) { 
			response.getWriter().append("Parametr ").append(Integer.toString(i)).append("<input name='numbers'/><br/>");
		}
		
		response.getWriter().append("<input type='submit'/>");
		response.getWriter().append("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String[] listOfParameters = request.getParameterValues("numbers");
		
		
		List<Double> listOfDoubles = new ArrayList<>();
		
		for(int i=0; i<listOfParameters.length; i++) { 
		
			try { 
		
				listOfDoubles.add(Double.valueOf(listOfParameters[i])); 
				
				
			} catch( NumberFormatException e) { 
				
			}
				
				
			}
		
		Collections.sort(listOfDoubles);
		
		response.getWriter().append(listOfDoubles.toString()); 
		
		
		
		}
		
	
		
		
	}


