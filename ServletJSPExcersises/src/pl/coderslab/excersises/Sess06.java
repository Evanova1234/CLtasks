package pl.coderslab.excersises;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess06
 */
@WebServlet("/favImages")
public class Sess06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		HttpSession sess = request.getSession();
		Object pagesVisitedObject = sess.getAttribute("pagesVisited");
		Object likeCountObject = sess.getAttribute("likeCount");

		if (pagesVisitedObject == null) {
			sess.setAttribute("pagesVisited", 0);
			pagesVisitedObject = sess.getAttribute("pagesVisited");
		}

		if (likeCountObject == null) {
			sess.setAttribute("likeCount", 0);
			likeCountObject = sess.getAttribute("likeCount");
		}

		Integer pagesVisitedInteger = (Integer) pagesVisitedObject;
		Integer likeCountInteger = (Integer) likeCountObject;

		showUserResults(response, pagesVisitedInteger, likeCountInteger);
		redirectUser(response, sess, pagesVisitedInteger);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		calculateIfLiked(request);
		doGet(request, response);
	}

	private void calculateIfLiked(HttpServletRequest request) {
		String ifLikes = request.getParameter("ifLikes");

		HttpSession sess = request.getSession();
		Object likeCountObject = sess.getAttribute("likeCount");
		Integer likeCountInt = (Integer) likeCountObject;
		if (likeCountObject == null) {
			sess.setAttribute("likeCount", 0);
		}
		if (ifLikes != null) {
			likeCountInt++;
		}
		sess.setAttribute("likeCount", likeCountInt);
	}

	private void redirectUser(HttpServletResponse response, HttpSession sess, Integer pagesVisitedInteger)
			throws IOException {
		if (pagesVisitedInteger < 4) {
			pagesVisitedInteger++;
			sess.setAttribute("pagesVisited", pagesVisitedInteger);
			response.sendRedirect("wybor_" + pagesVisitedInteger.toString() + ".html");
		} else {
			response.getWriter().append("Widziano już wszystkie obrazki. Koniec programu");
		}
	}

	private void showUserResults(HttpServletResponse response, Integer pagesVisitedInteger, Integer likeCountInteger)
			throws IOException {
		response.getWriter().append("Odwiedzłeś już ").append(pagesVisitedInteger.toString())
				.append(" stron. Polubiłeś zas ").append(likeCountInteger.toString()).append(" obrazków <br>");
	}

}
