package pl.coderslab.get;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post2
 */
@WebServlet("/Post2")
public class Post2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<String> badWords = (List<String>) Arrays.asList("cholera", "kurde");
	     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String text = request.getParameter("text");
		String consent = request.getParameter("consent");
		
		
		if (consent != null) { 
			
			response.getWriter().append(text);
			
		} else { 
			
			
			for(String badWord : badWords) { 
				
				StringBuilder censored = new StringBuilder();
				for(int i=0; i<badWord.length();i++) { 
					censored.append("*"); 							
				}
				
				
				text = text.replaceAll(badWord, censored.toString());
				
			}
			
			response.getWriter().append(text);
			
			
		}
		
	}

}
