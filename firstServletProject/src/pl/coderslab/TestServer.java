package pl.coderslab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServer")
public class TestServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestServer() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("<h1>Hello world.</h1>");
		response.getWriter().append("Mój własny tekst"); 
	}
}
