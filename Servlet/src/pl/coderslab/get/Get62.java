package pl.coderslab.get;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get62
 */
@WebServlet("/Get62")
public class Get62 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Get62() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    /**
	
		
		/* Drugi `Get62` powinien odebrać przesłane poprzez `GET` dane z pierwszego `Get61` i wygenerować `5` linków,
		 gdzie każdy z nich ma przenosić do trzeciego `Get63` przekazując metodą GET następujące dane:
		  * year - dane przesłane z poprzedniej strony
		  * mix - losowa wartość z zakresu od `-10` do `10`*/
		
		response.setContentType("text/html");
		String parameterValue = request.getParameter("year");
		String constantUrl1 = "<a href=\"http://localhost:8080/Servlet/Get63?year=";
		String constantUrl2 = "&mix=";
		String constantUrl3 = "\">LINK</a>";
		
		
		for(int i=0; i<5; i++) { 
			Random rn = new Random();
			Integer randomValue = rn.nextInt(20)-10; 
			response.getWriter().append("Link: ")
				.append(constantUrl1)
				.append(parameterValue)
				.append(constantUrl2)
				.append(Integer.toString(randomValue))
				.append(constantUrl3)
				.append("<br>");
		}
		
		
		
		
		
		
	}


}
