package pl.coderslab.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Get61")
public class Get61 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Get61() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/* Pierwszy `Get61`, powinien generować linki do drugiego `Get62` przekazując 
		metodą GET dane pod kluczem `year` (od `1980` do `2010`).*/
	
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String constantUrl1 = "<a href=\"http://localhost:8080/Servlet/Get62?year=";
		String constantUrl2 = "\">LINK</a>";
		
		for(int i=1980; i<=2010; i++) { 
			
			response.getWriter().append("Link do roku ").append(Integer.toString(i))
			.append(constantUrl1)
			.append(Integer.toString(i))
			.append(constantUrl2)
			.append("<br>");
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
