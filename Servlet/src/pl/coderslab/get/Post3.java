package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post3
 */
@WebServlet("/Post3")
public class Post3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Post3() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");

		try {

			double aNumeric = Double.parseDouble(a);
			double bNumeric = Double.parseDouble(b);
			double cNumeric = Double.parseDouble(c);
			double delta = Math.pow(bNumeric, 2) - 4 * aNumeric * cNumeric;

			if(delta<0) { 
				response.getWriter().append("Delta mniejsza od zera");
			} else { 
				
				double x1Numeric = (-bNumeric + Math.sqrt(delta)) / 2*aNumeric;
				double x2Numeric = (-bNumeric - Math.sqrt(delta)) / 2*aNumeric;
				response.getWriter().append("Miejsca zerowe to: ")
									.append(Double.toString(x1Numeric))
									.append(" oraz ")
									.append(Double.toString(x2Numeric));	
	
			}
			
			
		} catch (NumberFormatException e) {

			response.getWriter().append("Podano nieprawidłowe parametry");
		}

	}

}
